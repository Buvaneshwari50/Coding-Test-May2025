import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Create a map to store the count of multiples for 1 to 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize the map with keys 1 to 9 and values 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Loop through each number and update the count
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println("Output : ");
        System.out.println(countMap);
    }
}


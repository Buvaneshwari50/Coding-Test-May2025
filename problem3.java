
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            System.out.print((2 * i + 1));
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}

import java.util.Scanner;
public class Lab3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count Number: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        int count = 0;

        System.out.print("Fibonacci numbers " + n + " Is : ");

        while (count <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }


    }
}

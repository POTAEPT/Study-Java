import java.util.Scanner;

public class Lab5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            //for (int j = lines - i; j > 1; j--) {
            //    System.out.print("  ");
            //}
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}

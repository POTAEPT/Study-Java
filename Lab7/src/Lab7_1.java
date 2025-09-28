import java.util.Scanner;
public class Lab7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[5][4];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print("Enter the value of a[" + row + "][" + col + "]:");
                a[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
            //print values with space
                System.out.print(a[row][col] + " ");
            }
            // a newline for the next row
            System.out.println();
        }
    }
}

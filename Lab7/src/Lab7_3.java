import java.util.Scanner;

public class Lab7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the num of columns : ");
        int cols = sc.nextInt();

        int[][] data = new int[rows][cols];
        int[] rowTotals = new int[rows];
        int[] colTotals = new int[cols];
        int grandTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter rows  %d : Enter column  %d : ", i+1 , j+1);
                data[i][j] = sc.nextInt();
                rowTotals[i] += data[i][j];
                colTotals[j] += data[i][j];
                grandTotal += data[i][j];
            }
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-4d", data[i][j]);
            }
            System.out.printf("| %-4d\n", rowTotals[i]);
        }
        for (int j = 0; j < cols; j++) {
            System.out.print("----");
        }
        System.out.println("------");

        for (int j = 0; j < cols; j++) {
            System.out.printf("%-4d", colTotals[j]);
        }
        System.out.printf("| %-4d\n", grandTotal);

    }
}
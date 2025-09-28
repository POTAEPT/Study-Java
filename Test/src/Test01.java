import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        int[][] data = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = i + j;
            }
        }
        System.out.println(data[1][0]);

        int[][][] arr = new int[2][3][2];
        System.out.println(arr.length);

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[1][2]);

        int[] myArray = {10,20,30,45,50,60};
        myArray[3] = 40;

    }
}


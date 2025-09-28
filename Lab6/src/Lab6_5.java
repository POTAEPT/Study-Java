import java.util.Scanner;
public class Lab6_5 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 11, 12, 13, 14, 15, 19, 22};
        Scanner input = new Scanner(System.in);

        System.out.println("Original array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter a new value: ");
        int newValue = input.nextInt();


        int[] temp = new int[11];
        int inserted = 0;
        for (int i = 0; i < 10; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < 10; i++) {
            if (newValue < temp[i]) {
                for (int j = 10; j > i; j--) {
                    temp[j] = temp[j-1];
                }
                temp[i] = newValue;
                inserted = 1;
                break;
            }
        }
        if (inserted == 0) {
            temp[10] = newValue;
        }


        System.out.println("Resulting array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        input.close();
    }
}

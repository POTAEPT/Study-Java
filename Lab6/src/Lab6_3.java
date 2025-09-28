import java.util.Scanner;
public class Lab6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[15];
        System.out.println("Enter 15 doubles");
        for (int i = 0; i < 15; i++) {
            System.out.print("Doubles "+ (i+1) +" : " );
            arr[i] = input.nextDouble();
        }
        System.out.println("Array before replacement:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the index (0-14) to replace:");
        int idx = input.nextInt();
        System.out.println("Enter the new double value:");
        double newVal = input.nextDouble();

        arr[idx] = newVal;

        System.out.println("Array after replacement:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number[] = new double[10];
        double compare = 0;
        for (int i = 0; i < 10; i++ ) {
            System.out.print("Enter Number" +(i+1)+" : ");
            number[i] = input.nextDouble();
        }

        System.out.print("Enter one more double:");
        double newDouble = input.nextDouble();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (number[i] == newDouble) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value is already in the array.");
        } else {
            System.out.println("The value is NOT in the array.");
        }
        System.out.println("End Programe");
    }
}

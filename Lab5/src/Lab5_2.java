import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int max = 0, temp = 0;


        for (int i = 1; i <= n; i++) {
            System.out.println("Enter " + i + " integers:");
            int num = sc.nextInt();
            for (int j = num; j == num; j++) {
                if (num % 2 == 0) {
                    System.out.println(j + " is Even num");
                } else {
                    System.out.println(j + " is Odd num");
                }
            }
            int count = 0;
            if (num > 1) {
                for (int k = 2; k <= Math.sqrt(num); k++) {
                    if (num % k == 0) {
                        count++;
                        break;
                    }
                }
                for (int j = count; j == count; j++) {
                    if (count == 0) {
                        System.out.println(num + " is prime.");
                    } else {
                        System.out.println(num + " is not prime.");
                    }
                }
                if (num > temp) {
                    max = num;
                    temp = num;
                }
            }
        }
        System.out.println("The largest number is: " + max);
    }
}

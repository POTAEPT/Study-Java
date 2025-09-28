import java.util.Scanner;

public class Lab5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        String even = "";
        String prime = "";

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }

            if (num % 2 == 0) {
                even += num + " ";
            }

            int count = 0;
            if (num > 1) {
                for (int k = 2; k <= Math.sqrt(num); k++) {
                    if (num % k == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    prime += num + " ";
                }
            }
        }

        System.out.println("The even num is: " + even);
        System.out.println("The prime number is: " + prime);
        System.out.println("The largest number is: " + max);
    }
}

import java.util.Scanner;

public class Lab5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int min = 0, mid = 0, max = 0;

        for (int i = 0; i <3; i++) {
            if (a <= b && a <= c) {
                min = a;
                if (b <= c){
                    mid = b;
                    max = c;
                }else {
                    mid = c;
                    max = b;
                }
            } else if (b <= a && b <= c) {
                min = b;
                if (a <= c){
                    mid = a;
                    max = c;
                }else {
                    mid = c;
                    max = a;
                }
            }else{
                min = c;
                if (a <= b) {
                    mid = a;
                    max = b;
                }else {
                    mid = b;
                    max = a;
                }
            }
        }
        System.out.println("Sorted numbers: " + min + ", " + mid + ", " + max);
    }
}


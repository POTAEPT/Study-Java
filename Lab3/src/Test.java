import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int num = sc.nextInt();

        for(int i =1; i <= 12; i++)
        {
            System.out.println(num + " * " + i + " = "+ (num*i));
        }

    }
}
import java.util.Scanner;
public class Lab9_4 {

    public  static String oddOrEven(int num){
        return (num % 2 == 0) ? "EVEN" : "ODD";
    }

    public static void main(String[] args) {

        Scanner Sinput = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int input = Sinput.nextInt();

        System.out.printf("%d is %s%n", input, oddOrEven(input));
    }
}

import java.util.Scanner;
public class Lab9_1 {

    public static double Pownumber(double num){
        return Math.pow(2,num);
    }

    public static void main(String[] args) {

        Scanner Sinput = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double input = Sinput.nextDouble();
        Sinput.nextLine();

        System.out.printf("2^%.0f = %.2f", input, Pownumber(input));
    } 
}

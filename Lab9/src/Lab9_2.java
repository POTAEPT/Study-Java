
import java.util.Scanner;

public class Lab9_2 {

    public static double add(double x, double y){
        return x + y;
    }
    public static double subtract(double x, double y){
        return x - y;
    }
    public static double multiply(double x, double y){
        return x * y;
    }
    public static double divide(double x, double y){
        if (y == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }

    public static void main(String[] args) {

        Scanner Sinput = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double num = Sinput.nextDouble();
        Sinput.nextLine();

        while (true){
            System.out.print("Enter a word (add,subtract,multiply,divide,exit): ");
            String control = Sinput.next().trim().toLowerCase();

            if(control.equals("exit")){
                System.out.printf("Currently, num = %.2f", num);
                break;
            }
            System.out.print("Enter number: ");
            double value = Sinput.nextDouble();

            try {
                switch (control) {
                    case "add":
                        num = add(num, value);
                        break;
                    case "subtract":
                        num = subtract(num, value);
                        break;
                    case "multiply":
                        num = multiply(num, value);
                        break;
                    case "divide":
                        num = divide(num, value);
                        break;
                    default:
                        System.out.printf("Unknown command: %s Try again " , control);
                        return;
                }
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.printf("Currently, num = %.2f %n" , num);
        }
    } 
}

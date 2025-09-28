import java.util.Scanner;
public class Lab1_2 {
    public static void main(String[] args) {
        System.out.print("Enter Celsius : ");
        Scanner scannerC = new Scanner(System.in);
        double C = scannerC.nextDouble();
        double F = (9.0/5.0) * C + 32.0;
        System.out.println("The temperature in Fahrenheit for Celsius value "+ C +
                " is : " + F + " Fahrenheit");
        System.out.print("Enter Fahrenheit : ");
        Scanner scannerF = new Scanner(System.in);
        double F1 = scannerF.nextDouble();
        System.out.println(F1);
        double C1 = (F1 - 32.0)/(9.0/5.0) ;
        System.out.println("The temperature in Celsius for Fahrenheit value "+ F1 +
                " is : " + C1 + " Celsius");
//The temperature in Fahrenheit for Celsius value -5.0 is : 27.0 Fahrenheit
//The temperature in Celsius for Fahrenheit value -5.0 is -31.962962962962962 Celsius
    }
}


import java.util.Scanner;
public class Lab3_3 {
    public static void main(String[] args) {
        Scanner S_Control = new Scanner(System.in);
        System.out.print("How many of Number : ");
        int Control = S_Control.nextInt();

        String Numeber_Type = " ";
        int Number = 0;
        double Sum_Number = 0;
        int count = 0;
        double Average = 0;

        while (count != Control){

            Scanner S_Number = new Scanner(System.in);
            System.out.print("Enter Number : ");
            Number = S_Number.nextInt();

            if (Number%2 == 0){
                Numeber_Type = "Even";
            }else Numeber_Type = "Odd";
            System.out.println(Number+ " is " +Numeber_Type);

            Sum_Number = Sum_Number+Number;
            count = count+1;





        }
        Average = Sum_Number/Control;
        System.out.println("End Program");
        System.out.println("Totol of Number is : "+Sum_Number);
        System.out.println("Average is : " + Average);

    }
}

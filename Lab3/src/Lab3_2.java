import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        char input = ' ';

        int Credit = 0;
        int Grades = 0;

        while (input != 'z'){

            Scanner Scredit = new Scanner(System.in);
            System.out.print("Enter Credit : ") ;
            Credit = Scredit.nextInt();

            Scanner Sgrades = new Scanner(System.in);
            System.out.print("Enter Grades : ") ;
            Grades = Sgrades.nextInt();

            double GPA = (Credit * Grades)/Credit ;
            System.out.println("Your GPA : " + GPA);



            Scanner Sinput = new Scanner(System.in);
            System.out.print("Enter Z to End Program  : ");
            input = Sinput.nextLine().toLowerCase().charAt(0);

        }
        System.out.print("End Program");

    }
}

import java.util.Scanner;
public class Lab2_3 {
    public static void main(String[] args) {
        Scanner S_creditMath = new Scanner(System.in);
        System.out.print("Enter Your Math Credit : ");
        int Math_Credit = S_creditMath.nextInt();

        Scanner S_creditEng = new Scanner(System.in);
        System.out.print("Enter Your Math Credit : ");
        int Eng_Credit = S_creditEng.nextInt();

        Scanner S_GradeMath = new Scanner(System.in);
        System.out.print("Enter Your Math Grade : ");
        char Math_Grade = S_GradeMath.next().toUpperCase().charAt(0);

        Scanner S_GradeEng = new Scanner(System.in);
        System.out.print("Enter Your Math Grade : ");
        char Eng_Grade = S_GradeEng.next().toUpperCase().charAt(0);

        int Math_Point = 0;
        int Eng_Point = 0;

        if (Math_Grade == 'A') Math_Point = 4;
        else if (Math_Grade == 'B') Math_Point = 3;
        else if (Math_Grade == 'C') Math_Point = 2;
        else if (Math_Grade == 'D') Math_Point = 1;
        else if (Math_Grade == 'F') Math_Point = 0;

        if (Eng_Grade == 'A') Eng_Point = 4;
        else if (Eng_Grade == 'B') Eng_Point = 3;
        else if (Eng_Grade == 'C') Eng_Point = 2;
        else if (Eng_Grade == 'D') Eng_Point = 1;
        else if (Eng_Grade == 'F') Eng_Point = 0;


        double Sum_Credit = Math_Credit+Eng_Credit;
        double GPA = ((Math_Point * Math_Credit) +(Eng_Point * Eng_Credit))/Sum_Credit;
        System.out.println("Your GPA : " + GPA);

    }
}

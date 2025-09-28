import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {

        Scanner S_total_number = new Scanner(System.in);
        System.out.print("Enter Total Number Of Classes : ");
        int total_num = S_total_number.nextInt();

        Scanner S_timesLate = new Scanner(System.in);
        System.out.print("Enter  Number of times the student was late : ");
        int TL = S_timesLate.nextInt();
        int TimesLate = TL/2;

        Scanner S_TimesAbsent = new Scanner(System.in);
        System.out.print("Enter  Number of times the student was absent : ");
        int TimesAbsent = S_TimesAbsent.nextInt();
        int Total_absences = TimesAbsent + TimesLate;
        double max_Absent = total_num * 0.20;

        if (Total_absences < max_Absent){
            System.out.print("The student can take the exam");
        }
        else {
            System.out.print("The student cannot take the exam");
        }



    }
}

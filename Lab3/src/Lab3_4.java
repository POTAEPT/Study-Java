import java.util.Scanner;
public class Lab3_4 {
    public static void main(String[] args) {
        Scanner S_Num = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int Num = S_Num.nextInt();

        int count = Num;
        long Totol_Fac = 1;


        if (count > 0){
            while (Num > 0 ){
                Totol_Fac = Num * Totol_Fac;

                Num = Num - 1;
            }
            System.out.print(Totol_Fac);
        }else System.out.println("!!!non-negative integer only Try agian!!! ");

    }
}

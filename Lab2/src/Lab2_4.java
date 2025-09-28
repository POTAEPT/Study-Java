import java.util.Scanner;
public class Lab2_4 {
    public static void main(String[] args) {
        double amount;
        double Total_Spen;
        Scanner S_TotalPrice = new Scanner(System.in);
        System.out.print("Enter Total Price : ");
        double TotalPrice = S_TotalPrice.nextDouble();

        Scanner S_MemberShip = new Scanner(System.in);
        System.out.print("Your are MemberShip ?(Yes or No) : ");
        char Memmber = S_MemberShip.next().toLowerCase().charAt(0);

        if (Memmber == 'y'){
            Scanner S_MemberStatus = new Scanner(System.in);
            System.out.print("Enter MemberShip Status (Silver or Gold) : ");
            char Member_Status = S_MemberStatus.next().toLowerCase().charAt(0);
            if (Member_Status == 's'){
                if (TotalPrice <= 1000 ){
                    amount =  TotalPrice * 0.02 ;
                    Total_Spen = TotalPrice - amount;
                }else if (TotalPrice <= 10000){
                    amount =  TotalPrice * 0.03 ;
                    Total_Spen = TotalPrice - amount;
                }else{
                    amount =  TotalPrice * 0.05 ;
                    Total_Spen = TotalPrice - amount;
                }
                System.out.print("Total Price : "+Total_Spen);
            }else if (Member_Status == 'g'){
                if (TotalPrice <= 1000 ){
                    amount =  TotalPrice * 0.05 ;
                    Total_Spen = TotalPrice - amount;
                }else if (TotalPrice <= 10000){
                    amount =  TotalPrice * 0.08 ;
                    Total_Spen = TotalPrice - amount;
                }else{
                    amount =  TotalPrice * 0.1 ;
                    Total_Spen = TotalPrice - amount;
                }
                System.out.print("Total Price : "+Total_Spen);
            }

        }else if (Memmber == 'n'){
            System.out.print("Total Price : "+TotalPrice);
        }

    }
}

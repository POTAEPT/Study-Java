import java.util.Scanner;
public class Lab4_1 {
    public static void main(String[] args) {
        char input = ' ';
        int num = 0;
        int count = 0;

        while(input != 'z'){
            Scanner S_num = new Scanner(System.in);
            System.out.print("Input Number : ");
            num = S_num.nextInt();

            if (num%2 == 0){
                System.out.println(num + " is even");
            }
            else System.out.println(num + " is odd");

            count  = num+num;
            Scanner S_input = new Scanner(System.in);
            System.out.print("Enter Z to END : ");
            input = S_input.nextLine().toLowerCase().charAt(0);
        }
        System.out.print(count);
    }
}

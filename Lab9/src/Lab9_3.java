import java.util.Scanner;
public class Lab9_3 {
        /*************************************
         * labMethodQ1 accepts two integers.
         * it will return 0 when both integers are negative, otherwise return the
         summation.
         */
        public static int labMethodQ1(int x, int y){
            int sum= 0;
            if(x > 0 && y > 0 ){
                sum = x+y;
            }else {return 0 ;}

            return sum;
        }
        public static void main (String[] args)
        {
            int x,y;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter integer 1:");
            x = input.nextInt();
            System.out.print("Enter integer 2:");
            y = input.nextInt();
            System.out.println(labMethodQ1(x,y));
        }

}

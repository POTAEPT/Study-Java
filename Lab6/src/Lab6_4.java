import java.util.Scanner;

public class Lab6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[5];
        int height[] = new int[name.length];
        for (int i = 0; i<5 ; i++) {
            System.out.print("Enter Name" + (i+1) + " : ");
            name[i] = input.nextLine();
            System.out.print("Enter height" + (i+1) + " : ");
            height[i] = input.nextInt();
            input.nextLine();
        }
        int tallestIdx = 0;
        for (int i = 1; i < 5; i++) {
            if (height[i] > height[tallestIdx]) {
                tallestIdx = i;
            }
        }
        System.out.println("Tallest student: " + name[tallestIdx] + " (" + height[tallestIdx] + ")");
        input.close();
    }
}

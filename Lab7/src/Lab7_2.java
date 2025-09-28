import java.util.Scanner;
public class Lab7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[][] hw = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1));
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Height (cm): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Weight (kg): ");
            hw[i][1] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("No.| Name | Height | Weight ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d | %s | %.2f | %.2f | \n", (i+1), names[i], hw[i][0], hw[i][1]);
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Study_forExam {

    String[][] user = new String[5][2];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("""
                ============ Welcome To Program ============
                Press L to Login or Press E to Exit Program
                """);
        System.out.print(":");
        String input = sc.nextLine().trim().toUpperCase();
        switch (input){
            case "L": loginSytem(sc); break;
            case "E": return;
            default: System.err.print("Error Invalid choice : Press L or E only");
        }
    }

    public static void loginSytem (Scanner sc){
        System.out.println("===== Login =====");
        System.out.print("Username: ");
        String username = sc.nextLine().trim();
        System.out.print("Password: ");
        String password = sc.nextLine().trim();

    }
}

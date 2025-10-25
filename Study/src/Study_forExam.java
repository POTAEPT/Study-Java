import java.util.Scanner;

public class Study_forExam {

    static  String[][] user = new String[5][2];
    static  int userCount = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.print("""
                ============ Welcome To Program ============
                Press L to Login or Press E to Exit Program
                """);
            System.out.print(":");
            String input = sc.nextLine().trim().toUpperCase();
            switch (input){
                case "L": loginSystem(sc); break;
                case "E": System.out.println("Exit Program"); return;
                default: System.err.println("Error Invalid choice : Press L or E only");
            }
        }
        
    }

    public static void loginSystem (Scanner sc){
        System.out.println("===== Login =====");
        System.out.print("Username: ");
        String username = sc.nextLine().trim();
        System.out.print("Password: ");
        String password = sc.nextLine().trim();
        
        if(username.isEmpty() || password.isEmpty()){
            System.err.println("Invalid input : Input Username and Password");
        }
        
        boolean checking = checkLogin(user, userCount, username, password);
        if(checking){
            System.out.println("===== Hello "+ username + " =====");
        }else{System.out.println("User not found : username or password is wrong");}
    }

    public static boolean checkLogin(String[][] users, int userCount, String username , String password){
        if(username == null || password == null){
            return false;
        }
        for (int i = 0; i < userCount; i++){
            if(user[i] != null && users[i][0].equals(username) && users[i][1].equals(password)){
                return true;
            }
        }
        return false;
    }
}

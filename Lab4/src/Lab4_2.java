import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //(false = ยังไม่เลือก, true = เลือกแล้ว)
        boolean s1 = false, s2 = false, s3 = false, s4 = false, s5 = false;

        int round = 0;
        int player = 1;
        int p1Count = 0, p2Count = 0;
        boolean gameOver = false;
        int loser = 0;

        while (!gameOver) {
            System.out.println("ooooo");
            System.out.println("ooooo");
            System.out.println("Sticks on the table");
            System.out.println("1: " + (s1 ? "Picked" : "------"));
            System.out.println("2: " + (s2 ? "Picked" : "------"));
            System.out.println("3: " + (s3 ? "Picked" : "------"));
            System.out.println("4: " + (s4 ? "Picked" : "------"));
            System.out.println("5: " + (s5 ? "Picked" : "------"));

            System.out.println("\nThe " + player + " player turn");
            System.out.print("Please choose the stick number: ");
            int choice = scanner.nextInt();

            boolean valid = false;

            if (choice == 1 && !s1) {
                s1 = true;
                valid = true;
            } else if (choice == 2 && !s2) {
                s2 = true;
                valid = true;
            } else if (choice == 3 && !s3) {
                s3 = true;
                valid = true;
                gameOver = true;
                loser = player;
            } else if (choice == 4 && !s4) {
                s4 = true;
                valid = true;
            } else if (choice == 5 && !s5) {
                s5 = true;
                valid = true;
            }

            if (!valid) {
                System.out.println("Invalid choice or stick already picked. Try again.");
                continue;
            }

            // นับจำนวนไม้ที่เลือก
            if (player == 1) {
                p1Count++;
            } else {
                p2Count++;
            }

            round++;

            // ตรวจสอบว่าไม้หมดหรือยัง
            if (s1 && s2 && s3 && s4 && s5) {
                gameOver = true;
            }

            // สลับผู้เล่น
            if (!gameOver) {
                player = (player == 1) ? 2 : 1;
            }
        }

        // แสดงผลลัพธ์
        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + round);
        System.out.println("Player 1 picked: " + p1Count + " sticks");
        System.out.println("Player 2 picked: " + p2Count + " sticks");

        if (loser != 0) {
            int winner = (loser == 1) ? 2 : 1;
            System.out.println("Player " + winner + " wins!");
            System.out.println("Player " + loser + " loses (picked stick 3)");
        } else {
            System.out.println("All sticks picked. No one picked stick 3.");
            System.out.println("It's a draw!");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Lab7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"Physics", "Biology", "Chemistry"};


        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();


        double[][] scores = new double[n][3];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter the %d student %s score: ", i + 1, subjects[j]);
                scores[i][j] = sc.nextDouble();
            }
        }

        double[] studentTotals = new double[n];
        double[] studentAverages = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            studentTotals[i] = sum;
            studentAverages[i] = sum / 3.0;
        }

        double[] subjectAverages = new double[3];
        for (int j = 0; j < 3; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scores[i][j];
            }
            subjectAverages[j] = sum / n;
        }

        System.out.println("\nPhysics, Biology, Chemistry | Total | Average");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: ", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.1f ", scores[i][j]);
            }
            System.out.printf("| %.0f | %.0f\n", studentTotals[i], studentAverages[i]);
        }
        System.out.printf("\n------------------------------\n");
        System.out.println("Average scores for Physics, Biology, and Chemistry");
        for (int j = 0; j < 3; j++) {
            System.out.printf("%.1f ", subjectAverages[j]);
        }
        System.out.printf("\n------------------------------\n");

        // แสดง Pass/No
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: ", i + 1);
            for (int j = 0; j < 3; j++) {
                if (scores[i][j] >= subjectAverages[j]) {
                    System.out.print("Pass ");
                } else {
                    System.out.print("No ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
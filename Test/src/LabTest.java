public class LabTest {
    public static void main(String[] args) {
        int [][] grouptable = new int[5][2];
        grouptable[0][1] = 2;
        grouptable[1][0] = 3;
        grouptable[2][1] = 7;
        grouptable[3][0] = 10;
        grouptable[4][1] = 9;
        grouptable[4][1] = grouptable[1][1]*2;
        grouptable[1][1] = grouptable[1][0]*grouptable[4][0];

        int[][] tableA;
        int[][] tableB = new int [4][4];
        tableA = grouptable;
        tableB[0][0] = 100;
        tableB[0][1] = 50;
        tableA[0][0] = 100;
        grouptable[0][1] = 50;
        tableB[1][0] = 30;

        System.out.println("G table [0] [0] = " +grouptable[0][0]);
        System.out.println("A table [0] [0] = " +tableA[0][0]);
        System.out.println("B table [0] [0] = " +tableB[0][0]);
        System.out.println("G table [0] [1] = " +grouptable[0][1]);
        System.out.println("A table [0] [1] = " +tableA[0][1]);
        System.out.println("B table [0] [1] = " +tableB[0][1]);
        System.out.println("G table [0] [0] = " +grouptable[1][0]);
        System.out.println("A table [0] [0] = " +tableA[1][0]);
        System.out.println("B table [0] [0] = " +tableB[1][0]);

        System.out.println(grouptable);
        System.out.println(grouptable[0]);
        System.out.println(grouptable[0][0]);
        System.out.println(grouptable[1]);
        System.out.println(grouptable[1][1]);
    }
}

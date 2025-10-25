import java.util.Scanner;

public class DevLab {
    public static void main(String[] args) {
        int x = 15;
        sentence(x, 42);

        int y = x - 5;
        sentence(y, x + y);
    }

    public static void sentence(int x, int y) {
        System.out.println( x + " , " + y );
    }
}

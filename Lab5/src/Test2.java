import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                if (j < lines) {
                    // ถ้าเป็น index ก่อนสุดท้าย ให้พิมพ์ค่าของ i (เลขบรรทัดที่กำลังพิมพ์)
                    System.out.print(i);
                } else {
                    // ถ้าเป็น index สุดท้าย ให้พิมพ์ค่า j ปกติ
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

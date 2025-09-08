import java.util.Scanner;

public class C_Maximum_Even_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a % 2 == 0 && b % 2 != 0) {
                System.out.println(-1);
            } else if (a % 2 != 0 && b % 2 != 0) {
                System.out.println(Math.max(a + b, a * b + 1));
            } else if (a % 2 == 0 && b % 2 == 0) {
                System.out.println(Math.max(a + b, (a * b / 2) + 2));
            } else {
                if (b % 4 != 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(Math.max(a * 2 + b / 2, (a * b / 2) + 2));
                }
            }
        }
        sc.close();
    }

}
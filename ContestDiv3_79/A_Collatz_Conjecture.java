import java.util.Scanner;

public class A_Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();

            while (k > 0) {
                if (x % 6 == 4) {
                    x = (x - 1) / 3;
                } else {
                    x *= 2;
                }
                k--;
            }
            System.out.println(x);
        }
        sc.close();
    }
}

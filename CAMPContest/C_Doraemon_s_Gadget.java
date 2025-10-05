import java.util.Scanner;

public class C_Doraemon_s_Gadget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long sum = 0;
            for (int i = 0; i < n; i++)
                sum += a[i];

            // System.out.println(sum);
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                long pow = 1;
                while (pow * 2 <= a[i]) {
                    pow *= 2;
                }
                b[i] = pow;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(b[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();

        }
        sc.close();
    }
}
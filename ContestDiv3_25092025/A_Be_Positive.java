import java.util.Scanner;

public class A_Be_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int minus = 0;
            int zeros = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0)
                    zeros++;
                if (a[i] < 0)
                    minus++;
            }

            int min = 0;

            if (minus % 2 != 0) {
                min += 2;
            }

            min += zeros;
            System.out.println(min);
        }
        sc.close();
    }
}

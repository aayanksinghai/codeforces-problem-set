import java.util.Scanner;

public class C_MEX_rose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean[] present = new boolean[k];
            int k_count = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val < k) {
                    // Mark this required number as present.
                    present[val] = true;
                } else if (val == k) {
                    // Count occurrences of the forbidden number k.
                    k_count++;
                }
            }

            // Count how many numbers from 0 to k-1 are missing.
            int missing_count = 0;
            for (int i = 0; i < k; i++) {
                if (!present[i]) {
                    missing_count++;
                }
            }
            System.out.println(Math.max(missing_count, k_count));
        }
        sc.close();
    }
}
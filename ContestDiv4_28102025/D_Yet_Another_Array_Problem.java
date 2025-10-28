import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D_Yet_Another_Array_Problem {

    // We only need to check these primes.
    private static final int[] PRIMES_TO_CHECK = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            // Logic
            Set<Long> set = new HashSet<>();
            for (long num : arr)
                set.add(num);

            long ans = -1;

            for (int p : PRIMES_TO_CHECK) {
                boolean coPrimes = false;
                for (long val : set) {
                    if (val % p != 0) {
                        coPrimes = true;
                        break;
                    }
                }

                if (coPrimes) {
                    ans = p;
                    break;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }

    // private static long gcd(long x, long y) {
    // x = Math.abs(x);
    // y = Math.abs(y);
    // while (y != 0) {
    // long temp = y;
    // y = x % y;
    // x = temp;
    // }
    // return x;
    // }
}
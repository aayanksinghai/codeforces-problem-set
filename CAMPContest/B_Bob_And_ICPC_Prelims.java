import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Bob_And_ICPC_Prelims {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            // Logic
            if (isPalindrome(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }

    private static boolean isPalindrome(int[] a) {
        if (a.length < 3) {
            return false;
        }
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> second = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (!first.containsKey(a[i])) {
                first.put(a[i], i);
            }
            second.put(a[i], i);
        }

        for (Integer indx : first.keySet()) {
            int firstInd = first.get(indx);
            int lastInd = second.get(indx);

            if (lastInd - firstInd > 1) {
                return true;
            }
        }
        return false;
    }
}
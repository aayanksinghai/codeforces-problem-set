import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class C_Shifted_MEX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextLong());
            }

            ArrayList<Long> ls = new ArrayList<>(set);
            Collections.sort(ls);

            int best = 0;
            int cur = 1;

            for (int i = 1; i < ls.size(); i++) {
                if (ls.get(i) == ls.get(i - 1) + 1) {
                    cur++;
                } else {
                    best = Math.max(best, cur);
                    cur = 1;
                }
            }
            best = Math.max(best, cur);

            System.out.println(best);

        }
        sc.close();
    }
}
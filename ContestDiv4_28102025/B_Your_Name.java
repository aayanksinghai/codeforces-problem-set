import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Your_Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            char[] freq1 = new char[26];
            char[] freq2 = new char[26];

            for (char c : s.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    freq1[c - 'a']++;
                }
            }

            for (char p : t.toCharArray()) {
                if (p >= 'a' && p <= 'z') {
                    freq2[p - 'a']++;
                }
            }

            int flag = 0;
            for (int j = 0; j < 26; j++) {
                if (freq1[j] != freq2[j]) {
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                continue;

            System.out.println("YES");
        }
        sc.close();
    }
}
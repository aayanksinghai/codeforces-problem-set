import java.util.Scanner;

public class A_Football {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        sc.close();
        int countZero = 0;
        int countOne = 0;
        String ans = "NO";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '1') {
                if (countZero == 0) {
                    countOne++;
                } else {
                    countZero = 0;
                    countOne++;
                }
            }
            if (ch == '0') {
                if (countOne == 0) {
                    countZero++;
                } else {
                    countOne = 0;
                    countZero++;
                }
            }

            if (countZero == 7 || countOne == 7) {
                ans = "YES";
                break;
            }
        }
        System.out.println(ans);
    }

}

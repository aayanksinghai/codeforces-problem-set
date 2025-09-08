import java.util.Scanner;

public class A_Hulk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder ans = new StringBuilder();
        if (n == 1) {
            ans.append("I hate it");
            System.out.println(ans.toString());
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                if (i + 1 <= n) {
                    ans.append("I hate that ");
                } else {
                    ans.append("I hate it");
                }
            } else {
                if (i + 1 <= n) {
                    ans.append("I love that ");
                } else {
                    ans.append("I love it");
                }
            }
        }

        System.out.println(ans.toString());

    }
}
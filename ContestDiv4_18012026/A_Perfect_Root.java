import java.util.Scanner;

public class A_Perfect_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int k = 1;
            while (n-- >= 1)
                System.out.print(k++ + " ");

            System.out.println();
        }

        sc.close();
    }
}

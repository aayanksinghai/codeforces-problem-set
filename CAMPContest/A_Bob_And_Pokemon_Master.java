import java.util.Scanner;

public class A_Bob_And_Pokemon_Master {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            if (n <= 1399)
                System.out.println("Division 4");
            else if (1400 <= n && n <= 1599)
                System.out.println("Division 3");
            else if (1600 <= n && n <= 1899)
                System.out.println("Division 2");
            else
                System.out.println("Division 1");
        }
        sc.close();
    }
}
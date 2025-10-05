import java.util.Scanner;

public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        long oddCount = (n + 1) / 2;

        long result;
        if (k <= oddCount) {
            result = 2 * k - 1;
        } else {
            long evenPos = k - oddCount;
            result = 2 * evenPos;
        }
        System.out.println(result);

    }
}
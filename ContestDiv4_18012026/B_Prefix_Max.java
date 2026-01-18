import java.util.Scanner;

public class B_Prefix_Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            // logic
            int maxEle = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                maxEle = Math.max(maxEle, arr[i]);
            }

            System.out.println(maxEle * n);

        }
        sc.close();
    }
}
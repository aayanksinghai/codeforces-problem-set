import java.util.Scanner;

public class A_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int[] arr = new int[4];
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
            arr[3] = d;

            int num = a;

            int flag = 0;
            for (int i = 1; i < 4; i++) {
                if (num != arr[i]) {
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

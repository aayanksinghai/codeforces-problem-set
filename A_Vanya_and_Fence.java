import java.util.Scanner;

public class A_Vanya_and_Fence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int maxWidth = 0;
        for (int j = 0; j < n; j++) {
            if (height[j] <= h) {
                maxWidth += 1;
            } else {
                maxWidth += 2;
            }
        }

        System.out.println(maxWidth);
        sc.close();
    }
}

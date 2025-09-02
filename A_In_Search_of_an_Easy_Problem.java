import java.util.Scanner;

public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "EASY";

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                ans = "HARD";
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
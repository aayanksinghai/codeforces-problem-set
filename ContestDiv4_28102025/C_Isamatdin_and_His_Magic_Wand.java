import java.util.Arrays;
import java.util.Scanner;

public class C_Isamatdin_and_His_Magic_Wand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            // LOGIC
            int flagA = 0;
            int flagB = 0;

            for (int num : arr) {
                if (num % 2 == 0)
                    flagA = 1;
                if (num % 2 == 1)
                    flagB = 1;
            }

            if (flagA == 1 && flagB == 1) {
                Arrays.sort(arr);
                printArray(arr);
                System.out.println();
                continue;
            }
            printArray(arr);
            System.out.println();
        }
        sc.close();
    }

    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
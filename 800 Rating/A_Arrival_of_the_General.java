import java.util.Scanner;

public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        // Typically finding the number of swaps
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int minVal = 101;
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        sc.close();

        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxVal) {
                maxIndex = i;
                break;
            }
        }

        int minIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == minVal) {
                minIndex = i;
                break;
            }
        }

        int swaps = maxIndex;
        swaps += (n - 1) - minIndex;

        if (maxIndex > minIndex)
            swaps--;
        System.out.println(swaps);
    }
}
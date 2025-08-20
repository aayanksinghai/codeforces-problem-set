import java.util.Arrays;
import java.util.Scanner;

public class B_Honest_Coach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int i = 0; i < noOfTestCases; i++){
            int n = sc.nextInt();
            int[] strength = new int[n];
            int minAns = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                strength[j] = sc.nextInt();
            }

            Arrays.sort(strength);
            for(int k = 0; k < n-1; k++){
                int value = Math.abs(strength[k]-strength[k+1]);
                if(value < minAns){
                    minAns = value;
                }
            }
            System.out.println(minAns);
        }
        sc.close();
    }
}
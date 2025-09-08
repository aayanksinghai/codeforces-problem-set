import java.util.*;

public class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int noOfProblems = sc.nextInt();

        int[][] problems = new int[noOfProblems][3];

        for(int j = 0; j < noOfProblems; j++){
            for(int k = 0; k < 3; k++){
                problems[j][k] = sc.nextInt();
            }
        }

        int result = 0;
        for(int j = 0; j < noOfProblems; j++){
            int sum = 0;
            for(int i = 0; i < 3; i++){
                sum += problems[j][i];
            }
            if(sum >= 2){
                result += 1;
            }
        }

        System.out.println(result);
    }
}
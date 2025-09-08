import java.util.*;

public class A_Next_Round{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] score = new int[n];

        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }

        int noOfParticipantsAdvanced = 0;

        int threshold = score[k-1];
        for(int i = 0; i < n; i++){
            if(score[i] > 0 && score[i] >= threshold){
                noOfParticipantsAdvanced++;
            }
        }

        System.out.println(noOfParticipantsAdvanced);
    }
}
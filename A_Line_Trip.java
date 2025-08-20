import java.util.Scanner;

public class A_Line_Trip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int n = sc.nextInt();
            int x = sc.nextInt(); //last point
            int[] gasStations = new int[n];

            for(int j = 0; j < n; j++){
                gasStations[j] = sc.nextInt();
            }

            int maxDifference = gasStations[0]-0;
            for(int k = 1; k < n; k++){
                int diff = gasStations[k]-gasStations[k-1];
                if(diff > maxDifference){
                    maxDifference = diff;
                }
            }
            if(x-gasStations[n-1] > maxDifference){
                maxDifference = x-gasStations[n-1];
            }

            int distanceLast = 2*(x-gasStations[n-1]);
            if(maxDifference > distanceLast){
                System.out.println(maxDifference);
            }else{
                while (maxDifference < distanceLast) {
                    maxDifference++;
                }
                System.out.println(maxDifference);
            }

        }
        

        sc.close();
    }
}
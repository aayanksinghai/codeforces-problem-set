import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class A_Halloumi_Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i = 0; i < testCases; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] boxes = new int[n];
            for(int j = 0; j < n; j++){
                boxes[j] = sc.nextInt();
            }
            if(k > 1){
                System.out.println("YES");
            }else{
                int flag = 0;
                for(int m = 0; m < n-1; m++){
                    if(boxes[m] <= boxes[m+1]){
                        continue;
                    }else{
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1) System.out.println("NO");
                else System.out.println("YES");
            }
        }

        sc.close();
    }
    
}

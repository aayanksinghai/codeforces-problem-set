import java.util.Scanner;

public class A_Beautiful_Matrix {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
            
        }

        int row = 0, col = 0;
        boolean found = false;

        for(i = 0; i < 5 && !found; i++){
            for(j = 0; j < 5; j++){
                if(arr[i][j] == 1){
                    row = i;
                    col = j;
                    found = true;
                    break;
                }
            }
        }

        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);
        sc.close();
    }
}
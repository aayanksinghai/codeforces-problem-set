import java.util.Scanner;

public class A_George_and_Accommodation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] room = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                room[i][j] = sc.nextInt();
            }
        }

        int roomFree = 0;
        for (int i = 0; i < n; i++) {
            if (room[i][0] < room[i][1] - 1)
                roomFree++;
        }

        System.out.println(roomFree);
        sc.close();
    }
}
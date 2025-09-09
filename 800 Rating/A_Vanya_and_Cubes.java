import java.util.Scanner;

public class A_Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int height = 0;
        int level = 1;
        int cubesNeeded = 0;

        while (true) {
            cubesNeeded = (level * (level + 1)) / 2;
            if (n >= cubesNeeded) {
                n -= cubesNeeded;
                height++;
                level++;
            } else {
                break;
            }
        }
        System.out.println(height);
    }
}

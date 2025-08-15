import java.util.Scanner;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limakWeight = sc.nextInt();
        int bobWeight = sc.nextInt();

        int years = 0;
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            years++;
        }
        System.out.println(years);
        sc.close();
    }
}
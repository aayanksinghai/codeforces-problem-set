import java.util.Scanner;

public class A_Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] polarity = new String[n];
        for (int i = 0; i < n; i++) {
            polarity[i] = sc.next();
        }
        sc.close();

        int noOfGroups = 1;
        for (int j = 0; j < n - 1; j++) {
            if (polarity[j].equals(polarity[j + 1])) {
                continue;
            }
            noOfGroups++;
        }

        System.out.println(noOfGroups);
    }
}
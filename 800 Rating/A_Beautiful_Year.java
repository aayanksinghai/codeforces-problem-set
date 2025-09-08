import java.util.HashSet;
import java.util.Scanner;

public class A_Beautiful_Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int num = year;
        while (true) {
            if (isDistinctYear(num) == true && year < num) {
                break;
            }
            num++;
        }
        System.out.println(num);
        sc.close();
    }

    private static boolean isDistinctYear(int num) {
        String year = String.valueOf(num);
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < year.length(); i++) {
            set.add(year.charAt(i));
        }

        if (set.size() == year.length())
            return true;
        return false;
    }
}
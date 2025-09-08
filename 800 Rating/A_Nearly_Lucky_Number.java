import java.util.Scanner;

public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();  
        sc.close();

        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
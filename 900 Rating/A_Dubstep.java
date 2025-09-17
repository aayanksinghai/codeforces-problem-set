import java.util.Scanner;

public class A_Dubstep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        StringBuilder ans = new StringBuilder();
        boolean spaceNeeded = false;

        for (int i = 0; i < text.length();) {
            char c = text.charAt(i);
            if (i + 2 < text.length() && text.substring(i, i + 3).equals("WUB")) {
                i += 3;
                spaceNeeded = true;
            } else {
                if (spaceNeeded && ans.length() > 0) {
                    ans.append(' ');
                }

                ans.append(c);
                i++;
                spaceNeeded = false;
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }
}
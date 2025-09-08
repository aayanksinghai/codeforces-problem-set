import java.util.Scanner;

public class A_Translation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        if(new StringBuilder(s).reverse().toString().equals(t)) System.out.println("YES");
        else System.out.println("NO");
    }
}
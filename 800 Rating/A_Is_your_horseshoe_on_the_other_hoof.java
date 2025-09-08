import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        sc.close();

        Set<Integer> ans = new HashSet<>();
        ans.add(n1);
        ans.add(n2);
        ans.add(n3);
        ans.add(n4);

        System.out.println(4 - ans.size());
    }
}
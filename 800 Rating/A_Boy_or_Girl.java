import java.util.HashMap;
import java.util.Scanner;

public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < username.length(); i++) {
            map.put(username.charAt(i), map.getOrDefault(username.charAt(i), 0) + 1);
        }

        if ((map.size() % 2) == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}
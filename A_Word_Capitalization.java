import java.util.Scanner;

public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char firstAlph = str.charAt(0);
        System.out.println(String.valueOf(firstAlph).toUpperCase() + str.substring(1));

        /*
        System.out.print(Character.toUpperCase(str.charAt(0)));
		
		for (int i = 1; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
        */

        sc.close();
    }
}
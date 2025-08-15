import java.util.Scanner;

public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // Direct Function in Java
        int result = str1.compareToIgnoreCase(str2);
        if(result < 0){
            System.out.println(-1);
        }else if(result > 0) System.out.println(1);
        else System.out.println(0);

        sc.close();
    }
}
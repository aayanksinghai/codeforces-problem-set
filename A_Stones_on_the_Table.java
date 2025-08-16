import java.util.Scanner;

public class A_Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String color = sc.next();
        int result = 0;

        for(int i = 0; i < n-1; i++){
            if(color.charAt(i) == color.charAt(i+1)){
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}

import java.util.Scanner;

public class A_A_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String exp = sc.next();
            String[] exp1 = exp.split("\\+");
            int num1= Integer.parseInt(exp1[0]);
            int num2 = Integer.parseInt(exp1[1]);
            System.out.println(num1+num2);
        }
        sc.close();
    }
}
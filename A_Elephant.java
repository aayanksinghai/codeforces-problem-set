import java.util.Scanner;

public class A_Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int steps = 0;
        while(x > 5){
            steps++;
            x = x-5;
        }
        steps++;
        System.out.println(steps);
        sc.close();
    }
}
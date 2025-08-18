import java.util.Scanner;

public class A_Anton_and_Danik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        sc.close();
        int aWin = 0;
        int dWin = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'A') aWin++;
            else if(str.charAt(i) == 'D') dWin++;
        }

        if(aWin == dWin) System.out.println("Friendship");
        else if(aWin > dWin) System.out.println("Anton");
        else System.out.println("Danik");
    }
}
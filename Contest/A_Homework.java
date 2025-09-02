import java.util.Scanner;

public class A_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int n = sc.nextInt();
            String a = sc.next();
            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();

            for(int j = 0; j < b.length(); j++){
                char w = b.charAt(j);
                if(c.charAt(j) == 'D'){
                    a = a.concat(w + "");
                }else{
                    a = w + a;
                }
            }
            System.out.println(a);
        }
        sc.close();
    }
}

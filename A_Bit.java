import java.util.*;

public class A_Bit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfStatements = sc.nextInt();

        int initValue = 0;
        for(int i = 0; i < noOfStatements; i++){
            String operations = sc.next();

            if(operations.equals("++X") || operations.equals("X++")){
                initValue += 1;
            }else if(operations.equals("--X") || operations.equals("X--")){
                initValue -= 1;
            }
        }

        System.out.println(initValue);
    }
}
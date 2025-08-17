import java.util.Scanner;

public class A_Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int lowerCase = 0, upperCase = 0;
        for(int i = 0; i < word.length(); i++){
            int ascii = (int)word.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                upperCase++;
            }else if(ascii >= 97 && ascii <= 122){
                lowerCase++;
            }
        }
        if(lowerCase >= upperCase){
            word = word.toLowerCase();
        }else{
            word = word.toUpperCase();
        }
        System.out.println(word);
        sc.close();
    }
}
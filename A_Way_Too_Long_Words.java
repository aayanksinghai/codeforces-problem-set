import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc>0){
            tc--;
            String word = sc.next();
            int wordLength = word.length();
            if(wordLength < 10) {
                System.out.println(word);
                continue;
            }

            int countLength = 0;
            for(int i = 0; i < word.length(); i++){
                countLength++;
            }
            countLength = countLength-2;
            System.out.println(word.charAt(0) + "" + countLength + word.charAt(wordLength-1));
        }
    }
}
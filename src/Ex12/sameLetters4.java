package Ex12;

import java.sql.SQLOutput;

public class sameLetters4 {
    public static void main(String[] args) {
        String a = "abba "; // a = a.trim();
        String b = " baba";
        int aSum = 0;
        int bSum = 0;

        for(int i = 0 ; i < a.length(); i++){
            aSum += a.charAt(i);
        }

        for(int i = 0 ; i < b.length(); i++){
            bSum += b.charAt(i);
        }

        System.out.println(aSum==bSum);

    }
}

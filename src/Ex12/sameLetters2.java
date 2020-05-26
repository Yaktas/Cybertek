package Ex12;

import java.util.Arrays;

public class sameLetters2 {
    public static void main(String[] args) {
        String a = "aBba";
        String b = "baba";
        boolean same = sameLetters(a, b);
        System.out.println(same);

        a = "louis";
        b = "saint";
        same = sameLetters(a, b);
        System.out.println(same);

    }

    public static boolean sameLetters(String x, String y){
        x = x.toLowerCase();
        y = y.toLowerCase();

        String[] aText = x.split("");
        String[] bText = y.split("");
        Arrays.sort(aText);
        Arrays.sort(bText);
        return Arrays.equals(aText, bText);


    }

}


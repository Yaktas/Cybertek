package Ex12;

import java.util.Arrays;

public class sameLetters {


    public static void main(String[] args) {

        String a = "abba";
        String b = "baba";

        String[] aText = a.split(""); // a, b, b, a
        String[] bText = b.split(""); // b, a, b, a

        Arrays.sort(aText);
        Arrays.sort(bText);
        System.out.println(Arrays.equals(aText, bText));


    }
}

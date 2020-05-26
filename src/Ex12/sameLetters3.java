package Ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sameLetters3 {

    public static void main(String[] args) {
        String a = "aBba";
        String b = "baba";
        boolean same = sameLetters(a, b);
        System.out.println(same);
    }

    public static boolean sameLetters(String x, String y){
        x = x.toLowerCase();
        y = y.toLowerCase();

        ArrayList<String> aText = new ArrayList<>();
        ArrayList<String> bText = new ArrayList<>();

        aText.addAll(Arrays.asList(x.split("")));
        bText.addAll(Arrays.asList(y.split("")));

        Collections.sort(aText);
        Collections.sort(bText);

        return aText.equals(bText);

    }
}

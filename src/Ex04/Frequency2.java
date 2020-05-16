package Ex04;

import java.util.Arrays;
import java.util.Collections;

public class Frequency2 {
    public static void main(String[] args) {
        String str = "hellothere";
        String result = "";

        result = freqencyFind(str);
        System.out.println(result);

    }

    public static String freqencyFind(String str){
        String unique = "";
        String frequencyResult ="";

        for(int i = 0; i < str.length(); i++){
            if(!unique.contains(str.charAt(i) + ""))
                unique +=str.charAt(i) + "";
        }

        String[] newArray = str.split("");

        //h, e, l, l, o , t, h, e, r, e

        for(int i = 0; i< unique.length(); i++) {

            int count = Collections.frequency(Arrays.asList(newArray), ""+unique.charAt(i) );

            frequencyResult +=  unique.charAt(i) + "" + count;
        }


        return frequencyResult;

    }
}

// benim adim yucel

// String[] myName = str.split(""); y,u,c,e,l
// String[] myName = str.split(" ") benim, adim, yucel
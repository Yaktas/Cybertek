package Ex14;

import java.util.Arrays;

public class NumbersLettersSort {

    public static void main(String[] args) {
        String s1 = "AZCXCVTZNMIPR95034268011GYTH5462";
        String newString = "";
        for(int i = 0 ; i < s1.length()-1; i++){

            newString +="" + s1.charAt(i);

            //first letter than number
            if(Character.isAlphabetic(s1.charAt(i)) && Character.isDigit(s1.charAt(i+1))){
                newString +="" + ";";
            }

            //first number than letter
            if(Character.isDigit(s1.charAt(i)) && Character.isAlphabetic(s1.charAt(i+1))){
                newString +="" + ";";
            }

        }


        // newString=AZC;9501;GYTH;5462

        String[] splitText = newString.split(";");

        // splitText[0] = "AZC"
        // splitText[1] = "9501"
        // splitText[2] = "GYTH"
        // splitText[3] = "5462"

        s1="";

        for(String each: splitText ){

            String[] splitTextElement = each.split("");   // A, Z, C
            Arrays.sort(splitTextElement); //A, C, Z
            for(String harf: splitTextElement)
                s1 += "" + harf;   // ACZ
        }

        System.out.println(s1);

    }
}

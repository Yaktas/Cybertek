package Ex14;

public class NumbersLettersSort {

    public static void main(String[] args) {
        String s1 = "AZC9501GYTH5462";
        s1 = s1.toLowerCase();
        String newString = "";

        for(int i = 0 ; i < s1.length()-1; i++){

            newString +="" + s1.charAt(i);             // AZC|

            /*
            //first letter than number
            if(Character.isAlphabetic(s1.charAt(i)) && Character.isDigit(s1.charAt(i+1))){
                newString +="" + "|";
            }

            //first number than letter
            if(Character.isDigit(s1.charAt(i)) && Character.isAlphabetic(s1.charAt(i+1))){
                newString +="" + "|";
            }

            */

            int  diff = Math.abs(s1.charAt(i) - s1.charAt(i+1));
            if( diff > 26 )
                newString +="" + " ";

        }

        String[] splitText = newString.split(" ");

        //System.out.println(splitText[0]);

        for(String each: splitText ){
          System.out.println(each);
        }


        //System.out.println(newString.toUpperCase());
    }
}

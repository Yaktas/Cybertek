package Ex13;

public class GetAlphabet {
    public static void main(String[] args) {
        String s = "a///bc1&&++++23def"; //assume there is no special character
        String myText = "";
        String myNumber = "";
        String special = "";

        for(int i = 0; i < s.length(); i++){

            if(Character.isAlphabetic(s.charAt(i)))
                myText +=  s.charAt(i);
            else if(Character.isDigit(s.charAt(i)))
                myNumber += "" + s.charAt(i);
            else
                special+= "" + s.charAt(i);
        }

        System.out.println(myText);
        System.out.println(myNumber);
        System.out.println(special);
    }
}

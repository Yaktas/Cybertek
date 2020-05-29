package Ex13;

public class GetAlphabet2 {

    public static void main(String[] args) {
        String s = "a///bc1&&++++23def"; //assume there is no special character
        String myText = "";
        String myNumber = "";
        String special = "";

        int count = 0;


        while( count < s.length() ) {

            if (Character.isAlphabetic(s.charAt(count)))
                myText += s.charAt(count);
            else if (Character.isDigit(s.charAt(count)))
                myNumber += "" + s.charAt(count);
            else
                special += "" + s.charAt(count);

            count++;  // iterator
        }

        System.out.println(myText);
        System.out.println(myNumber);
        System.out.println(special);

    }
}

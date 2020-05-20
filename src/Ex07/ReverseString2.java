package Ex07;

public class ReverseString2 {

    public static void main(String[] args) {

        String str = "bugun hava gunesli";
        String reverse = "";

        String[] strArray = str.split(" "); //

        // strArray[0] = "bugun",
        // strArray[1] = "hava",
        // strArray[2] = "gunesli",

        for( int i = strArray.length - 1; i>=0 ; i--) {
            System.out.print(strArray[i]+" ");
        }

        //////////////////////////////////////////////////////////////

        System.out.println();
        reverse = reverseMyString(str);
        System.out.println(reverse);
    }

    public static String reverseMyString(String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        String reverseString = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverseString += str.charAt(i);
        }

        return reverseString;
    }


}

package Ex06;

public class ReverseString {

    public static void main(String[] args) {
        String str = "level level";
        String reverse = "";
        reverse = reverseMyString(str);

        System.out.println(str.equals(reverse));
    }

    public static String reverseMyString(String str){
        str = str.toLowerCase();

        String reverseString = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverseString += str.charAt(i);
        }

        return reverseString;
    }

}

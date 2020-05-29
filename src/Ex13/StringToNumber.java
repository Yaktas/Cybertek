package Ex13;

public class StringToNumber {

    public static void main(String[] args) {
        String s = "a1v1b1x";
        int sum = 0;
        //sum = stringNumber(s);
        sum = stringFromAcscii(s);
        System.out.println(sum);
    }

    public static int stringNumber(String s){
        int total = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                total += Integer.parseInt(""+s.charAt(i));
            }
        }
        return total;
    }

    public static int stringFromAcscii(String s){
        int total = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > 48 && s.charAt(i) < 58 ){  //is digit
                total += Integer.parseInt(""+s.charAt(i));
            }
        }
        return total;
    }
}

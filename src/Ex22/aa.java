package Ex22;

public class aa {

    static String str = "Text123text123";

    static String justNumber = str.replaceAll("[^0-9]", "");

    static String justLetter = str.toLowerCase().replaceAll("[^a-z]", "");



            public static void main(String[] args) {
                System.out.println(justNumber);
                System.out.println(justLetter);


    }
}

package Ex05;

public class Frequency3 {

    public static void main(String[] args) {
        String str = "hellothere";
        String result = "";

        result = freqencyFind(str);
        System.out.println(result);
    }

    public static String freqencyFind(String str){

        String frequencyResult ="";

        while ( 0 < str.length()){
            int count = 0;

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == str.charAt(0))
                    count++;
            }


            frequencyResult += ""+str.charAt(0)+count;
            str = str.replace(""+str.charAt(0), "");

            //System.out.println(str);


        }


        return frequencyResult;

    }
}



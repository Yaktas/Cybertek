package Ex03;

public class Frequency {
    public static void main(String[] args) {
        //Frequency myObject = new Frequency();

        String str = "hellothere";
        String result = "";

        result = frequecyFinder(str);
        System.out.println(result);
    }

    public static String frequecyFinder(String str){
        String frequencyResult = "";
        String uniqueValues = "";

        for(int i = 0; i < str.length(); i++){
            if(!uniqueValues.contains(""+str.charAt(i)))
                uniqueValues+=""+str.charAt(i);     //helotr
        }

        for(int i = 0; i < uniqueValues.length(); i++ ){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == uniqueValues.charAt(i))
                    count++;
            }
            frequencyResult +=""+uniqueValues.charAt(i) + count;
        }
        return  frequencyResult;
    }


}

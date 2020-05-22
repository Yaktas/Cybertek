package Ex10;

public class uniqueLetters {

    public static void main(String[] args) {
        //Frequency myObject = new Frequency();

        String str = "hellothere";  //otr
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
            if(count == 1)
              frequencyResult +=""+uniqueValues.charAt(i);
        }
        return  frequencyResult;
    }

}

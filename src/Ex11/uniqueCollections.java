package Ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueCollections {

    public static void main(String[] args) {
        String htr = "hellothere";  // object unmutable
        ArrayList<String> result = new ArrayList<>();
        result = uniqueLetters(htr);
        System.out.println(result);
        String btr = "bayram";
        result = uniqueLetters(btr);
        System.out.println(result);
    }

    public static ArrayList<String> uniqueLetters(String str){
        ArrayList<String> mylist = new ArrayList<>();
        mylist.addAll(Arrays.asList(str.split("")));
        mylist.removeIf(x->Collections.frequency(mylist, x)>1);
        return mylist;
    }
}


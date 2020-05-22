package Ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueCollections {

    public static void main(String[] args) {
        String str = "hellothere";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));
        list.removeIf(x->Collections.frequency(list, x)>1); //lamda expressions
        System.out.println(list);

    }
}


package Ex09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinArrayList {
    public static void main(String[] args) {
        Integer[] arr = { 0, 56, 100, 45, 5};
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr));
/*
        for(Integer each: list){
            System.out.println(each);
        }

*/

        int newNumber = 123;

        list.add(newNumber);
        Collections.sort(list);
                                            // 0, 1, 2,  3,   4
        int max = list.get(list.size()-1);  // 0, 5, 45, 56, 100

        System.out.println(max);

    }

}

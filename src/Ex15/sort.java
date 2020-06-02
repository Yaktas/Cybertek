package Ex15;

import java.util.ArrayList;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        int[] arr = {4, 1, 67, 17, 44, 90, 74, 23, 19};

        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();

        for(int each: arr){
            list.add(each);
        }

        for(int i = 0; i < arr.length; i++){

            arr[i] = findMinimum(list);
            list.remove(Integer.valueOf(arr[i]));
        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }

    public static int findMinimum(ArrayList<Integer> newList){

        int min_value = Integer.MAX_VALUE;
        for(Integer each: newList){
            min_value = Math.min(min_value,each);
        }
        return min_value;
    }

}

package Ex18;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArrayListDescent {


    public static void main(String[] args) {

        int[] arr = {4, 1, 67, 17, 44, 90, 74, 23, 19};

        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();

        for(int each: arr){
            list.add(each);
        }

        for(int i = 0; i < arr.length; i++){

            arr[i] = findMax(list); //Integer
            list.remove(Integer.valueOf(arr[i]));
        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }

    public static int findMax(ArrayList<Integer> newList){

        int max_value = Integer.MIN_VALUE;
        for(Integer each: newList){
            max_value = Math.max(max_value,each);
        }
        return max_value;
    }
}

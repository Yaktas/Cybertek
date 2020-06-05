package Ex17;

import java.util.Arrays;

public class sortArray2 {

    public static void main(String[] args) {

        int[] arr = {1, 67, 4, 17, 44, 90, 74, 23, 19};

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length-1; i++){

            int max_index = i;

            for(int j = i +1 ; j < arr.length; j++){
                if(arr[j] > arr[max_index]){
                    max_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }



}

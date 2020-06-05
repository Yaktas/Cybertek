package Ex16;

import java.util.Arrays;

public class sortArray {

    public static void main(String[] args) {

        int[] arr = {1, 67, 4, 17, 44, 90, 74, 23, 19};

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length-1; i++){

            int min_index = i;

            for(int j = i +1 ; j < arr.length; j++){      // 2

                    if(arr[j] < arr[min_index]){
                        min_index = j;
                    }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

            System.out.println(Arrays.toString(arr));
        }



    }



}

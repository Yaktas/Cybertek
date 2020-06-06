package Ex20;

import java.util.Arrays;

public class sortArray3 {

    public static void main(String[] args) {
        int[] arr = {4,8,0,2,3,0,0,1,5,9};
        int[] arr2 = new int[arr.length];  // arr2 = {0,0,0,0,0,0,0,0,0,0}

        int j = 0;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > 0){
                arr2[j] = arr[i]; //arr2 = {4,8,2,3,1,5,9,0,0,0}
                j++;
            }
        }


        System.out.println(Arrays.toString(arr2));
    }
}

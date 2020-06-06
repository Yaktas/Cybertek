package Ex21;

import java.util.Arrays;

public class concat {
    public static void main(String[] args) {
        int[] arr1 = {4,8,2,3,0,5};
        int[] arr2 = {7,6,1,2,3};

        int[] newArray = new int[arr1.length + arr2.length];

        int j = 0;



        for(int i = 0 ; i < arr1.length; i++){
            newArray[j] = arr1[i];
            j++;
        }




        for(int i = 0  ; i < arr2.length; i++){
            newArray[j] = arr2[i];  //newArray[6] = arr2[0];
            j++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}

package Ex08;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrMax {

    public static void main(String[] args) {

        int[] arr = { 0, 56, 100, 45, 5};
        // 123




        int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        newArr[5] = 123;


        int min = newArr[0];
        int max = newArr[0];

        for(int i = 0 ; i <= newArr.length -1; i++){


            //System.out.println(newArr[i]);

            if( newArr[i] < min)
                min = newArr[i];
            if( newArr[i] > max)
                max = newArr[i];
        }

        System.out.println("Minumum number: " + min);
        System.out.println("Maximum number: " + max);


    }
}

package Ex08;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrMax {

    public static void main(String[] args) {

        int[] arr = { 0, 56, 100, 45, 5};

        int min = arr[0];
        int max = arr[0];

        for(int i = 0 ; i < arr.length - 1; i++){

            if( arr[i] < min)
                min = arr[i];
            if( arr[i] > max)
                max = arr[i];
        }

        System.out.println("Minumum number: " + min);
        System.out.println("Maximum number: " + max);


    }
}

package Ex19;

import java.util.ArrayList;
import java.util.Arrays;

public class sendZeros {

    public static void main(String[] args) {

        int[] arr = {4,8,0,2,3,0,0,1,5,9};

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int each: arr){
            list.add(each);
            //if(each == 0) count++;
        }

        list.removeAll(Arrays.asList(0));   //4,8,2,3,1,5,9

        int [] arr2 = new int[arr.length]; // 0,0,0,0,0,0,0,0,0,0
 /*
        int i = 0;

        for(Integer each: list){
            arr2[i] = each;
            i++;
        }
*/

        for(int i = 0; i < list.size(); i++) {
            arr2[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr2));

    }
}

package Ex23;

import java.util.Scanner;

public class finraRange {
    public static void main(String[] args) {


        String myResult = Finra();
        System.out.println(myResult);



    }

    public static String Finra(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        System.out.println("Please enter the first number greater than 0 and less than 100");
        int first = input.nextInt();

        while( first < 1 || first > 100){
            System.out.println("Please enter a valid number");
            first = input.nextInt();
        }
        System.out.println("Please enter the second number greater than "+ first +" and less than 100");
        int second = input.nextInt();

        while( second < first || second > 100){
            System.out.println("Please enter a valid number");
            second = input.nextInt();
        }

        String result = "";
        while( first <= second){

            if (first % 3 == 0 && first % 5 == 0)
                result += "FINRA ";
            else if (first % 3 == 0)
                result += "FIN ";
            else if (first % 5 == 0)
                result += "RA ";
            else
                result +=first +" ";
            first++;
        }
        return result;
    }




}

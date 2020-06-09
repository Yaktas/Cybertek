package Ex23;

import java.util.Scanner;

public class finra {
    public static void main(String[] args) {
        // 0 1 2 FIN 4 RA FIN 7 ... FINRA;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer less than 100");

        int number = input.nextInt();

        String result = "";

        while( number > 100){
            System.out.println("Please enter a valid number");
            number = input.nextInt();
        }

        int i = 1 ;
        while( i <= number){

            if (i % 3 == 0 && i % 5 == 0)
                result += "FINRA ";
            else if (i % 3 == 0)
                result += "FIN ";
            else if (i % 5 == 0)
                result += "RA ";
            else
                result +=i +" ";
            i++;
        }

        System.out.println(result);
    }
}

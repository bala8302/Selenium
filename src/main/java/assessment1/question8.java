package assessment1;

import java.util.Scanner;

public class question8 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int num = Integer.parseInt(input.next());
       // System.out.println("Entered values are  : " + num);
        int sum = 0;
        while (num > 0) {
            //System.out.println("out 1= " + num);
            sum = sum + num % 10;
            //System.out.println("out 2= " + sum);
            num = num / 10;
            //System.out.println("out 3= " + num);
        }
        System.out.println("sum of all digits for the entered input are = " + sum);


    }
}

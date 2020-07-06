package assessment1;

import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter values");
        // Read user inputs
        int input1 = Integer.parseInt(myObj.nextLine());
        int input2 = Integer.parseInt(myObj.next());
        // Output user input
        System.out.println("Inputs are  " + input1 + " : " + input2);
        // perform actions
        int add = input1 + input2 ;
        System.out.println("sum of 2 numbers are : " + add);
        int sub = input1 - input2 ;
        System.out.println("difference of 2 numbers are : " + sub);
        int multiply = input1 * input2 ;
        System.out.println("value of 2 numbers are : " + multiply);
        int div = input1 / input2;
        System.out.println("quotient of 2 numbers are : " + div);
        int mod = input1 % input2;
        System.out.println("remainder of 2 numbers are : " + mod);



    }
}

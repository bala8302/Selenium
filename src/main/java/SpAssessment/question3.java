package SpAssessment;

import java.util.Scanner;

public class question3{

/*3.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
*/

    public static void main(String[] args) {
        // Create a Scanner object
         Scanner in = new Scanner(System.in);
       System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
 
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));
 
    }
}

package SpAssessment;

import java.util.Scanner;

public class question4 {

/*Write a Java program that takes a number as input and prints its multiplication table upto 10.
*/

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Input the Number: ");
  int n = in .nextInt();
  for (int i = 1; i <= 10; i++) {
   System.out.println(n + "*" + i + " = " + (n * i));
  }
 }
}

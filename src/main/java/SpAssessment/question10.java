package SpAssessment;

import java.util.Scanner;
public class question10{
/*10.	Write a Java program to reverse a string.

Input Data:
Input a string: The quick brown fox 
Expected Output
Reverse string: xof nworb kciuq ehT
*/
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }    }
}

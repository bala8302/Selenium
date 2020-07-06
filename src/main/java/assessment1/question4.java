package assessment1;

import java.util.Scanner;

public class question4 {
    public static void main(String [] args) {
        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the input ");
        // Read user inputs
        int input = Integer.parseInt(myObj.next());
        System.out.println(" input given is :" + input);
        for(int i=1 ; i<11;i++) {
          int mul = input * i;
          System.out.println(" answer is : " + input + "*" + i + " = " + mul);
        }
    }
}

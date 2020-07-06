package task1;

import java.util.Scanner;

public class question4{

/* 4. Swap given two numbers and print them. (Try to do it without a temporary variable.) 
*/
	public static void main(String[] args) {
		
		int a ,b;
		//Scanner s = new Scanner(System.in);
		System.out.println("enter the value of first number") ;	
		Scanner input1=new Scanner(System.in);
		a =input1.nextInt();
 
		System.out.println(a);
		System.out.println("enter the value of second number");
		Scanner input2 = new Scanner(System.in);
	
		b =input2.nextInt();
		System.out.println(b);	
		
		a=a+b;
		b=a-b;
	    a=a-b;
		System.out.println("Print the values fo a and b after swapping" +a +b);
	}
	
}


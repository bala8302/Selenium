package SpAssessment;

public class question6{
/*6.Write a Java program to add two binary numbers. 
Input Data: 
Input first binary number: 10  
Input second binary number: 11 
Expected Output 
Sum of two binary numbers: 101 
*/
public static String add(String b1, String b2) { 
int binary1 = Integer.parseInt(b1,2); 
System.out.println("First binary value to integer number is : " + binary1);
int binary2 = Integer.parseInt(b2,2); 
System.out.println("Second binary value to integer number is : " + binary2);
int sum = binary1 + binary2; 
System.out.println("Sum of two integer number is : " + sum);
String Result = Integer.toBinaryString(sum);
System.out.println("Addition of two binary number is : " + Result);
return Result;
    }
    public static void main(String[] args) {
         add("10","11");  
    }
    
}

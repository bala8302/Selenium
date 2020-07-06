package assessment2;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.google.common.primitives.Ints.concat;

public class task2 {

    //1. Write a Java Program to Add Two Matrix Using Multi-dimensional Arrays 
    @Test(enabled = true)
    public static void testCase1() {
        int rows, columns, sum;
        int a[][] = {{1,3,4}, {2, 4,9},{2, 0,9}};
        int b[][] = {{1, 4,6}, {4, 3,9},{3,1,8}};
        int c[][] = new int[a.length][b.length];
        rows = a.length;
        columns = a[0].length;
        System.out.println("Sum of 2 matrix are : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print( c[i][j] + " ");
            }
            System.out.println();
        }
    }

    //2. Write a Java Program to Multiply to Matrix Using Multi-dimensional Arrays 
    @Test(enabled = true)
    public static void testCase2() {
        int rows, columns, sum;
        int a[][] = {{1,3,4}, {2,4,9},{2,0,9}};
        int b[][] = {{1,4,6}, {4,3,9},{3,1,8}};
        int c[][] = new int[a.length][b.length];
        rows = a.length;
        columns = a[0].length;
        System.out.println("Product of 2 matrix are : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print( c[i][j] + " ");
            }
            System.out.println();
        }
    }

    //3. Write a Java Program to Find Transpose of a Matrix 
    //4. Write a Java Program to Find the Frequency of Character in a String 
    // 5. Write a Java Program to Calculate Difference Between Two Time Periods 

    //6. Write a Java Program to Remove All Whitespaces from a String 

    @Test(enabled = true)
    public void testCase6(){
        String str = " Product of 2 matrix are :  ";
        System.out.println(str.replaceAll("\\s" , ""));
    }

//7. Write a Java Program to Convert String to Date

    @Test(enabled = true)
    public void testCase7() throws ParseException {
        String date="15/04/2020";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println(date+"\t"+date1);
    }

    // 8. Write a Java Program to Concatenate Two Arrays 

    @Test(enabled = true)
    public void testCase8(){
        int[] a = {0,2,4,6,8};
        int[] b = {1,3,5,7,9};
        int[] c = new int[a.length + b.length];
        c = concat(a,b) ;
        System.out.println("Concatenated array is : ");
        for(int i : c){
            System.out.print(i);
        }
    }

    //9. Write a Java Program to Convert Character to String and Vice-Versa 
    @Test(enabled = true)
    public void testCase9(){
        String input = "Character";
        String str = "" ;
        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            System.out.println("Character at "+i+" Position: "+ch);
            str= String.valueOf(ch);
            System.out.println("String is: "+str);
        }
    }

}

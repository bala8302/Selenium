package assessment2;
import org.testng.annotations.Test;
import javax.swing.*;
import java.util.Scanner;

public class task3 {

    //  1. Write a Java Program to determine whether a given matrix is an identity matrix 
    @Test(enabled = true)
    public static void testCase1() {
        int rows, columns;
        boolean flag = false;
        int a[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        rows = a.length;
        System.out.println("rows length :" + rows);
        columns = a[0].length;
        System.out.println("columns length is :" + columns);
        if (rows != columns) {
            System.out.println("Matrix should be a square matrix");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (i == j && a[i][j] == 1) {
                        System.out.println("value of i is : " + i + " value of j is : " + j);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("Given matrix is an identity matrix");
            else
                System.out.println("Given matrix is not an identity matrix");
        }
    }

    //2. Write a Java Program to find the sum of each row and each column of a matrix 
    @Test(enabled = true)
    public static void testCase2() {
        int rows, columns, sum;
        int a[][] = {{1, 3}, {2, 4}};
        int b[][] = {{1, 4}, {4, 3}};
        int c[][] = new int[a.length][b.length];
        rows = a.length;
        System.out.println("rows length :" + rows);
        columns = a[0].length;
        System.out.println("columns length is :" + columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("Sum of 2 matrix are : " + c[i][j]);
            }
        }
    }

    //Write a Java Program to find the product of two matrices 

    @Test(enabled = true)
    public void testCase3() {
        int rows, columns, sum;
        int a[][] = {{1, 3}, {2, 4}};
        int b[][] = {{1, 4}, {4, 3}};
        int c[][] = new int[a.length][b.length];
        rows = a.length;
        System.out.println("rows length :" + rows);
        columns = a[0].length;
        System.out.println("columns length is :" + columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.println("product of 2 matrix are : " + c[i][j]);
            }
        }
    }

    //4. Write a Java Program to determine whether two matrices are equal 

    //5. Write a Java Program to display the lower triangular matrix 
    @Test(enabled = true)
    public void testCase5() {
        int rows,columns;
        int a[][] = {{1,3,5}, {2,4,9}, {2,6,1} };
        rows = a.length;
        System.out.println("rows length :" + rows);
        columns = a[0].length;
        System.out.println("columns length is :" + columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if((rows==columns) && (j>i))
                    System.out.print("0 ");
                else
                    System.out.print(a[i][j] + " ");
            }
           System.out.println();
        }
    }

    //6. Write a Java Program to display the upper triangular matrix 

    @Test(enabled = true)
    public void testCase6() {
        int rows,columns;
        int a[][] = {{1,3,5}, {2,4,9}, {2,6,1} };
        rows = a.length;
        System.out.println("rows length :" + rows);
        columns = a[0].length;
        System.out.println("columns length is :" + columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if((rows==columns) && (j<i))
                    System.out.print("0 ");
                else
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //7. Write a Java Program to find the frequency of odd & even numbers in the given matrix 

    @Test(enabled = true)
    public void testCase7() {
        int rows, columns, even = 0, odd = 0;
        int a[][] = {{1, 3, 5}, {2, 4, 8}, {2, 6, 1}};
        rows = a.length;
        System.out.println("rows length :" + rows);
        columns = a[0].length;
        System.out.println("columns length is :" + columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((a[i][j] % 2) == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println(" Frequency of odd number = " + odd);
        System.out.println(" Frequency of even number = " + even);
    }

    //8. Write a Java Program to find the transpose of a given matrix 

    @Test(enabled = true)
    public void testcase8(){
        int rows, columns;
        int a[][] = {{1, 3, 5}, {2, 4, 8}, {2, 6, 1}};
        rows = a.length;
        columns = a[0].length;
        int b[][] = new int[rows][columns];
        System.out.println("transpose matrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j]+ " " );
            }
            System.out.println();
        }
    }

    //9. Write a Java Program to find the longest repeating sequence in a string 

    public static String input(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }
    @Test(enabled = true)
    public void testCase9() {
        String str = "vijiajiraji";
        String str1 = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String str3 = input(str.substring(i, n), str.substring(j, n));
                if (str3.length() > str1.length()) str1 = str3;
            }
        }
        System.out.println("Longest repeating sequence: " + str1);
    }
}


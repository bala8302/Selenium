package task3;

public class question2     
{    
    public static void main(String[] args) { 
        //2. Write a Java Program to find the sum of each row and each column of a matrix 
        
         int rows, columns, sum;
        int a[][] = {{2, 3}, {5, 4}};
        int b[][] = {{1, 1}, {4, 7}};
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
}
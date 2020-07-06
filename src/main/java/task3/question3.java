package task3;

public class question3     
{    
    public static void main(String[] args) { 
       // 3. Write a Java Program to find the product of two matrices
        
        int rows, columns, sum;
        int a[][] = {{3, 3}, {1, 4}};
        int b[][] = {{6, 4}, {7, 5}};
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
}
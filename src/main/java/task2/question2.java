package task2;

public class question2{

     public static void main(String []args){

//2. Write a Java Program to Multiply to Matrix Using Multi-dimensional Arrays 

        int rows, columns, sum;
        int a[][] = {{1,6,4}, {0,4,9},{2,0,9}};
        int b[][] = {{1,4,6}, {4,4,6},{3,1,8}};
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
}
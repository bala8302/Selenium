package task2;

public class question1{

     public static void main(String []args){


    //1. Write a Java Program to Add Two Matrix Using Multi-dimensional Arrays 


        int rows, columns, sum;
        int a[][] = {{1,2,4}, {5,7,8},{1,5,9}};
        int b[][] = {{1,5,8}, {3,6,9},{4,3,8}};
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
}
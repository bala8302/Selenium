package task3;

public class question1     
{    
    public static void main(String[] args) { 
        
        //  1. Write a Java Program to determine whether a given matrix is an identity matrix 
            int rows, columns;
        boolean flag = true                             ;
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
                    if (i == j && a[i][j] != 1) {
                        System.out.println("value of i is : " + i + " value of j is : " + j);
                        flag = true;
                        break;
                    }
			if(i != j && a[i][j] != 0){    
                      flag = false;    
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
}
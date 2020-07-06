package task3;

public class question5 {  
    public static void main(String[] args) {  
        
        //5. Write a Java Program to display the lower triangular matrix 
         
       int rows,columns;
        int a[][] = {{1,3,4}, {6,9,6,}, {4,5,8} };
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
}  
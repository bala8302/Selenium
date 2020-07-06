package task3;

public class question7 {  
    public static void main(String[] args) {  
        
        //7. Write a Java Program to find the frequency of odd & even numbers in the given matrix 
         
        int rows, columns, even = 0, odd = 0;
        int a[][] = {{2, 8, 5}, {2, 4, 8}, {2, 6, 1}};
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
}  
package task3;

public class question4  {  
    public static void main(String[] args) {  
        
         //4. Write a Java Program to determine whether two matrices are equal 
         
        int row1, col1, row2, col2;  
        boolean flag = true;  
          
                int a[][] = {{2, 1, 3},  {1, 2, 3},  {6, 7, 9} };
                int b[][] = {{2, 1, 3},  {1, 2, 3},  {6, 7, 9} }; 
  
          row1 = a.length;  
        col1 = a[0].length;  
  
          row2 = b.length;  
        col2 = b[0].length;  
          
        if(row1 != row2 || col1 != col2){  
            System.out.println("Matrices are not equal");  
        }  
        else {  
            for(int i = 0; i < row1; i++){  
                for(int j = 0; j < col1; j++){  
                  if(a[i][j] != b[i][j]){  
                      flag = false;  
                      break;  
                  }  
                }  
            }  
              
            if(flag)  
                System.out.println("Matrices are equal");  
            else  
                System.out.println("Matrices are not equal");  
        }  
    }  
}  
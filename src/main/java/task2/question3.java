package task2;

public class question3{

     public static void main(String []args){

 //3. Write a Java Program to find the transpose of a given matrix 
    

       int rows, columns;
        int a[][] = {{2,6,5}, {1,3,5}, {1,2,3}};
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
}
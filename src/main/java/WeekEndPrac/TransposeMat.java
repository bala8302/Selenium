package WeekEndPrac;

import java.util.Scanner;

public class TransposeMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter total rows and columns: ");
		
		int rowcnt = s.nextInt();
		int colcnt = s.nextInt();
		
		int arr[][] = new int[rowcnt][colcnt];
		
		int arr1[][];
		
		arr1= new int[2][2];
		
		System.out.println("Enter matrix:");
		
		for (int i=0;i<rowcnt;i++)
		{
			for (int j=0;j<colcnt;j++)
			{
				//System.out.println(arr[i][j]+ " ");
				
				arr[i][j]= s.nextInt();
				System.out.print(" ");
			}
		}
		
		for(int i = 0; i < rowcnt; i++)
    	{
      	    for(int j = 0; j < colcnt; j++)
            {
          	System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

	}

}

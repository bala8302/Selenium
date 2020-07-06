package SelenExercise;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,j,k;
		for(i=1; i<=5; i++)
		{
		for(j=4; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
		
		}
		
	/*	int n=4, j, i, space = 1;
		
		space = n - 1;

		  for (i = 1; i<=n; i++)
		  {
		    for (j = 1; j<=space; j++)
		      System.out.print(" ");

		    space--;

		    for (j = 1; j<= 2*i-1; j++)
		      System.out.print("*");

		    System.out.print("\n");
		  }*/

		
	}

}

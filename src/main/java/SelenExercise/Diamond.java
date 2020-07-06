package SelenExercise;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=4, j, i, space = 1;
		
		space = n - 1;

		  /*for (i = 1; i<=n; i++)
		  {
		    for (j = 1; j<=space; j++)
		      System.out.print(" ");

		    space--;

		    for (j = 1; j<= 2*i-1; j++)
		      System.out.print("*");

		    System.out.print("\n");
		  }*/
		  space = 1;
		 
		  for (i = 1; i<= n - 1; i++)
		  {
		    for (j = 1; j<= space; j++)
		      System.out.print(" ");
		
		    space++;
		 
		    for (j = 1 ; j<= 2*(n-i)-1; j++)
		      System.out.print("*");
		 
		    System.out.println("");
		  }

	}

}

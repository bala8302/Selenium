package PracticeTest;

public class Exc1Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =4,space= 1;		
		space = num-1;
		
	  for (int i=1;i<=num;i++)
	  {
		  for (int j=1;j<=space;j++)
			  
		  System.out.print(" ");
		  
		  space--;
		  
		  for (int k=1;k<=2*i-1;k++)
			  
		  System.out.print("*");
		  
		  System.out.print("\n");
	
	  }
		space=1;
	  for (int i=1;i<=num-1;i++)
	  {
		  for (int j=1;j<=space;j++)
			  
		  System.out.print(" ");
		  
		  space++;
		  
		  for (int k=1;k<=2*(num-i)-1;k++)
			  
		  System.out.print("*");
		  
		  System.out.print("\n");
	
	  }
		
		
		
		
		
		

	}

}

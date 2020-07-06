package SelenExercise;

public class StarProgExr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6;
		//int fact=1;
		/*
		for (int row=0;row<num;row++)
		{
			for(int col=0;col<row;col++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}*/
		
		
		/*for (int row=num;row>0;--row)
		{
			for(int col=0;col<row;col++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}*/

		
		int numm=5;
		int fact=1;
		
		for(int i=numm;i>0;--i)
		{
			fact+=fact*i;
		}
		
		System.out.println("Fact"+fact);
	}

}

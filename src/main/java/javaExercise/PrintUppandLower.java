package javaExercise;

public class PrintUppandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Tgh";
		
		String lc="";
		
		String UC ="";
		
		for (int i=0; i < str.length(); i++)
		{
			char s = str.charAt(i);
			
			if (Character.isLowerCase(s))
			{
				lc = lc +s;
				
		   }
			
			else
			{	
				UC = UC + s;	
				
			}
		}

		System.out.println("lowercase= "+lc);
		System.out.println("uppercase= "+UC);
	}

}

package javaExercise;

public class VowlesConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "TestLeaf";
		
		int len = s.length();
		
		int cons =0;
		int vow = 0;
		
		for(int i=0;i<len;i++)
		{
			char c=s.charAt(i);
		
			if ((c=='a')||(c =='e')||(c =='i')
					||(c =='o')||(c =='u'))
			{
				vow ++;
			}
			
			else
				
			{
				cons ++;
			}
		}

		 System.out.println("Vowel count is"+vow);
		 System.out.println("consonant count is"+cons);
		 
				
	}

}

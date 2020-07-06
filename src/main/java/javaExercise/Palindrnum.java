package javaExercise;

public class Palindrnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n ="7895";
		char s ;
		
		String s1="";
		int len = n.length();
		
		for(int i=len-1;i>0;i--)

		{
		    s = n.charAt(i);	
			if( Character.isDigit(s))
			{
			  s1 += i;
			}
		
		}

		System.out.println(s1);
	}

}

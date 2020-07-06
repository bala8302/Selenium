package javaExercise;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="MOM";
		
		String revstr="";
		
		int n = s.length();
		
		for (int i=n-1;i>=0;--i)
		{
		char s1 = s.charAt(i);
		revstr+=s1;	
		}
		
		if(s.contentEquals(revstr))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

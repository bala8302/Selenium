package javaExercise;

public class Exce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABC";
		
		String s1 ="";
		
		int len = s.length();
		
		for (int i=0;i<len;i++)
		{
		 System.out.println(s.charAt(i)); 
		 
		 s1 += (char)s.charAt(i)+1;
		 
		 System.out.println(s1);
		}
		

	}

}

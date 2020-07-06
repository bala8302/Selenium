package javaExercise;

public class WhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =" TestLeaf  ";
		
		String s;
		
		s = str.trim();
		
		System.out.println(str);
		System.out.println(s);
		
		String str1 =" TestLeaf  ";
		
		str1 = str1.replaceAll("\\s", "");
		
		System.out.println(str1);
		

	}

}

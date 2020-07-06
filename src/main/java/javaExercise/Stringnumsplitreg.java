package javaExercise;

public class Stringnumsplitreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd1234rtff";
		
		String[] part = str.split("[a-z]+|\\d+");
		System.out.println(part[0]);
		//System.out.println(part[1]);
		

	}

}

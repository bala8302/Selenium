package javaExercise;

public class StringIntSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcd1234rtff";
		int i;
		for(i = 0; i < a.length(); i++){
		    char c = a.charAt(i);
		    if( '0' <= c && c <= '9' )
		        break;
		}
		String alphaPart = a.substring(0, i);
		String numberPart = a.substring(i);
		
		System.out.println(alphaPart);
		System.out.println(numberPart);

	}

}

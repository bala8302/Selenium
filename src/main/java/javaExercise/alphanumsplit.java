package javaExercise;

public class alphanumsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="abc123,;";
		
		int len = s.length();
		
		char a;
		String number = "";
        String letter = "";
		
		for (int i=0;i<len;i++)
		{
			a = s.charAt(i);
			
			if(Character.isDigit(a))
			{
				number= number+a;
			}
			
			else
			{
				letter = letter+a;
			}
		}
		
		
		
		System.out.println("Alphates in string:"+letter);
        System.out.println("Numbers in String:"+number);


	}

}

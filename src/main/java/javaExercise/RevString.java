package javaExercise;


public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sa";
		String rev="";
        int len=s.length();
        for(int i=len-1;i>=0;--i)
        {
        	rev+=s.charAt(i);
        	
        	
        }
        System.out.println(rev);
        if(s.equals(rev))
        {
        	System.out.println("string is equal");
        	
        }
        else
        {
        	System.out.println("not equal");
	
        }
	
	}
	
}
          
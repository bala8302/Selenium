package day3;

public class Work {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s,s1,s2,s3,s4;
		
		s= "balasubramani0787 (13612)";
		
		System.out.println(s);
		
		s1 = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
		
		System.out.println(s1);	
         
		s2 = s.substring(s.indexOf("("));
		
		System.out.println(s2);	
		
		s3 = s.substring(s.indexOf(")"));
		
		System.out.println(s3);	
		
		s4 = s.substring(0,s.indexOf("(")-1);
		
		System.out.println(s4);


	}

}

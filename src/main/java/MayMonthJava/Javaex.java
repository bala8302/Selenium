package MayMonthJava;

import java.util.ArrayList;
import java.util.List;

public class Javaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "ef123ff";
		int i=0;
		char s;
		List<Character> intecnt = new ArrayList<Character>();
		
		List<Character> chaccnt = new ArrayList<Character>();
		for(;i<ss.length();i++)
		{
			s = ss.charAt(i);
		   
			if(Character.isDigit(s))
			{
				intecnt.add(s);	
			}			
			else
			{
				chaccnt.add(s);
				
			}   
		}	
		System.out.println("intecnt"+intecnt);
		System.out.println("chaccnt"+chaccnt);
	}

}

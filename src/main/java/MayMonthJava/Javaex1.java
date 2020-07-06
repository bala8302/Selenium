package MayMonthJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaExercise.Regexx;

public class Javaex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sd = "re3455trr";
		
		String sd1 = "3455";
		/*boolean s = sd.matches("\\d+");
		
		boolean s1 = sd1.matches("\\d+");
		System.out.println(s1);
		
		String[] numb = sd.split("\\d+");
		
		for(String n:numb)
		{
			System.out.println(n);
		}*/
		
		Pattern p = Pattern.compile("\\d+");
		
		Matcher m = p.matcher(sd);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}

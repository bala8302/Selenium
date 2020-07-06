package javaExercise;

import org.apache.commons.lang3.StringUtils;

public class stringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="istrddistr";
		
		s.indexOf("is");
		
		//System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf("is", s.indexOf("is") + 1));
		System.out.println(s.indexOf("tr", s.indexOf("tr") + 1));
		
	//System.out.println(StringUtils.ordinalIndexOf("Java Language", "a", 2));	

	}

}

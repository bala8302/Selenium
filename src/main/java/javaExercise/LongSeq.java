package javaExercise;

import java.util.LinkedList;
import java.util.List;

public class LongSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> intlist = new LinkedList<String>();
		String str1="";
		String intarray[]={"1","2","-3","-4","5","6","7","-8","9","10","11","12","13","14"};
		
		for(int i=0;i<intarray.length;i++)
		{
			if(Integer.parseInt(intarray[i])<0)
			{
				intarray[i]="&";
				intlist.add(intarray[i]);
			}
		}
		
		for (String str : intarray) {
			str1=str1+str;
		}
		int temp1=0;
		int temp2=0;
		
		String major="";
		String[] splitstr = str1.split("&");
	
		
		
		
		for (int i=0;i<splitstr.length;i++)
		{
			temp1=splitstr[i].length();
			if(temp1>temp2)
			{
				major =splitstr[i];
				temp2 = splitstr[i].length();
			}
			
		}
		
		System.out.println(major);

	}

}

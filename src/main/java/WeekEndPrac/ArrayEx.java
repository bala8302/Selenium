package WeekEndPrac;

import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="c:\\test\\fgg.txt";
		
		int index = s.lastIndexOf("\\");
		
		String ch = s.substring(index);
		
		System.out.println(ch);
		
		String revstr="";
		
		String chr = "Autom testig gduu ddfff";
		
		String[] sp = chr.split(" ");
		
		int cnt =sp.length;
		
		System.out.println(cnt);
				
		for (String ss:sp)
		{
			//System.out.println(ss);
		}
		
		
		for (int i=0;i<sp.length;i++)
		{
			
			for (int j=sp[i].length()-1;j>0;--j)
			{
				char ff = sp[i].charAt(j);
				revstr +=ff;
			}
		}
		
        System.out.println(revstr);
	}

}

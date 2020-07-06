package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lis = new ArrayList<String>();
		lis.add("tees");
		lis.add("ffff");
		
		/*for(String l:lis)
		{
			System.out.println(l);
		}*/
		
		lis.forEach((n)->System.out.println(n));

	}

}

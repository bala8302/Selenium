package TestingPack;

import java.util.ArrayList;
import java.util.List;

public class ExceJan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,7};
		int b[] = {3,4,5,6,2,1,7};
		List<Integer> lint = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++){
				
				if(a[i]==b[j])
				{
					System.out.println("a"+a[i]);
					lint.add(a[i]);
				}
			}
		}

	}

}

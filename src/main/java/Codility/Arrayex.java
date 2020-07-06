package Codility;

import java.util.Arrays;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {6,1,3,5,7};
		
		int b[] = Arrays.copyOf(a, a.length);
		
        Arrays.sort(b);		
        
        for (int i=0;i<b.length;i++)
        {
        System.out.println(b[i]);
        }
		
	}

}

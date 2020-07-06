package MayMonthJava;

import java.util.Arrays;

public class Javaex3 {

	public Javaex3() {
		// TODO Auto-generated constructor stub
		System.out.println("constuctor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("dddf");
		Javaex3 ex3 = new Javaex3();
		
		int a[] = {1,5,8};
		
		int b[] = {2,3,7};
		
		int length = a.length + b.length;
		
		int c[]=new int[length];;
		
		int i=0;
		for(int aa:a)
		{
			c[i]=aa;
			i++;
		}
		
		for(int bb:b)
		{
			c[i]=bb;
			i++;
		}
		
		Arrays.sort(c);
        
		//System.ar
		System.out.println(Arrays.toString(c));
		
		//System.out.println(Arrays.sort(c));

	}

}
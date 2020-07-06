package day1;

import java.util.Scanner;

public class PrimeNum {

	 
	public static void main(String[] args)
	{
	int num=5;	
	
	boolean flag=true;
	for(int j=2;j<num;j++)
	{
		if(num%j==0)
		flag=false;
		
	}
	if(flag)
	{
		System.out.println("prime no :"+num);
	}
	
}
}
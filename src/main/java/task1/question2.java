package task1;

import java.util.Arrays;

public class question2{
	
	public static void main(String args[])
	{
///2. Write a java program to reverse an array
        int [] input = {1,2,3,4,5};
        int [] reverse = new int[input.length];

        for(int i=0 ; i<input.length;i++){
            reverse[input.length-1 - i] = input[i];
            System.out.println("add to reverse array : " + Arrays.toString(reverse));
        }
        for(int i=0 ; i<input.length;i++){
            input[i] =  reverse[i] ;
            System.out.println("add to input array : " + Arrays.toString(input));
        }
        System.out.println(Arrays.toString(input));
	}
    }

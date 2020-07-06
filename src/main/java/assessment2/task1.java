package assessment2;

import org.testng.annotations.Test;

import java.util.Arrays;

public class task1 {

    //1. Write a java program to reverse a string

    @Test(enabled = true)
    public void testCase1(){
        String str = "posistion";
        char ch[]=str.toCharArray();
        String reverse="";
        for(int i=ch.length-1;i>=0;i--){
            reverse+=ch[i];
        }
        System.out.println("reverse of a string is : " + reverse);
    }

    //2. Write a java program to reverse an array
    @Test(enabled = true)
    public void testCase2(){
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

    //4. Swap given two numbers and print them. (Try to do it without a temporary variable.)

    @Test(enabled = true)
    public void testCase4(){
        int x= 23 , y= 32 ;
        System.out.println("Before swapping : " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping :" + x + " " + y);
    }
    @Test(enabled = true)
    public void testCase5(){
        boolean flag=true;
        int n=5;
        if (n == 0)
            flag = false;

        while (n != 1) {
            if (n % 2 != 0)
                flag = false;
            n = n / 2;
        }
        flag = true;
        if(flag==true)
            System.out.println("given number is power of 2");
        else
            System.out.println("Given number is not power of 2");
    }
}


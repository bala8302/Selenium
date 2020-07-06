package task4;

import java.util.*;
public class question6 {  
    
     
  /*  6. Write a java program to check whether given number is binary or not. 
    A binary number is a number which contains only 0 or 1.
    For example : 101101, 110010110, 10010011 are binary numbers */
    
    public static void main(String[] args) {  
     String Num = "10010011";
        int count=0;
        char[] ch=Num.toCharArray();
        for (int i=0;i<Num.length();i++)
        {
            int number=Character.getNumericValue(ch[i]);
            if (number>1)
                count++;
        }
        if(count>0)
            System.out.println("Number is not binary");
        else
            System.out.println("Number is binary");

    }  
}  
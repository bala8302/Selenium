package task4;

import java.util.*;
public class question5 {  
    
       /* 5. Write a java program to find continuous sub array of the given array whose sum is equal to a given number.
    For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number,
    then you have to find continuous sub array in this array such that whose elements add up to 45.
    In this case, {5, 31, 9} is such sub array whose elements add up to 45*/
    
    public static void main(String[] args) {  
      int [] input = {12, 5, 31, 9, 21, 8};
        int count = 0 , sum = 45  , i=0,j=0;
        String subArray = "";
        outer:
        for( ; i<input.length ;i++){
            count += input[i];
            subArray += input[i] + ",";
            System.out.println("sum of values of " + i + " is " + count);
            if(count == sum) {
                System.out.println("subArray are {" + subArray + "}");
                break ;
            }
            else if(count>45){
                j++;
                count =0;
                i=--j;
                subArray="";
                continue outer;
            }
        }

    }  
}  
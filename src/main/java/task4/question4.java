package task4;

import java.util.*;
public class question4 {  
    
        /*   4. Write a java program to find all pairs of elements in the given array whose sum is equal to a given number. 
    For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
    then you have to find all pairs of elements in this array whose sum must be 20.
    In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20 */
    public static void main(String[] args) {  
     int[] input = {4, 5, 7, 11, 9, 13, 8, 12};
        int sum=20;
        for(int i=0; i<input.length;i++){
            for(int j=i+1; j<input.length;j++){
               if(input[i] + input[j] == sum)
                   System.out.println("pairs are " + input[i] + "," + input[j]);
            }
        }
    }  
}  
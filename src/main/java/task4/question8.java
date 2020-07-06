package task4;

import java.util.*;
public class question8    
{    
    public static void main(String[] args) { 
        
        /*8. Write a java program to separate zeros from non-zeros in the given array.
            You have to move zeros either to end of the array or bring them to beginning of the array.
    For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0}
 and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}. */
    
        int input[] = {14, 0, 5, 2, 0, 3, 0};
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    for(int i=0;i<input.length;i++){
        if(input[i] == 0)
            list1.add(input[i]);
        else
            list2.add(input[i]);
    }
    List<Integer> zeroLast = new ArrayList<Integer>(list2);
    zeroLast.addAll(list1);
    System.out.println(zeroLast);
    List<Integer> zeroFirst = new ArrayList<Integer>(list1);
    zeroFirst.addAll(list2);
    System.out.println(zeroFirst);
  
    }    
} 
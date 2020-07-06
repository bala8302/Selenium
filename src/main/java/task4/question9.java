package task4;

import java.util.*;
public class question9    
{    
    public static void main(String[] args) { 
        
       /*9. If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements from 1 to n.
    Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once.
            If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}.
    One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.*/
    
        int a[] = {1, 4, 5, 3, 7, 8, 6 };
        int n = 7 ,i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        System.out.println( total);
  
    }    
} 
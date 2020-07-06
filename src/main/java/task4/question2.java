package task4;

import java.util.*;
public class question2 {  
    
        /*2. Write a Java program to find second largest number in an integer array */
    public static void main(String[] args) {  
    int a[]={1,2,5,6,3,10};
        int b[]={44,66,99,77,33,22,55};
        Arrays.sort(a);
        System.out.println("Second largest number is : " + a[a.length-2]);
        Arrays.sort(b);
        System.out.println("Second largest number is : " + b[b.length-2]);
  
    }  
}  
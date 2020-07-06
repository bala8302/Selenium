package task2;


import java.util.*;
public class question8{

     public static void main(String []args){

 // 8. Write a Java Program to Concatenate Two Arrays 

        int[] a = {0,2,4,6,8};
        int[] b = {1,3,5,7,9};
        int[] c = new int[a.length + b.length];
        int pos = 0;
        for (int element : a) {
            c[pos] = element;
            pos++;
        }
        for (int element : b) {
            c[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(c));
    }
}
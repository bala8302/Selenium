//1. Write a java program to find duplicate characters and their count in a given string.
//For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2 

package assessment2;

import org.junit.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.*;


public class task4 {

    /*1. Write a java program to find duplicate characters and their count in a given string.
    For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2*/

    @Test(enabled = true)
    public void testCase1(){
        String str = "Better Butter";
        char[] chr = str.toCharArray();
        Map<Character, Integer> dup = new HashMap<Character, Integer>() ;
            for(Character ch : chr){
                if(dup.containsKey(ch))
                    dup.put(ch,dup.get(ch)+1);
                else
                    dup.put(ch,1);
            }
            Set<Character> keys = dup.keySet();
            for(Character ch : keys){
                if(dup.get(ch)>1)
                    System.out.println(ch +" is " + dup.get(ch) + " times repeated");
            }
    }

   /* 3. Write a java program to count the number of occurrences of each character in a given string.
    For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each character in this
    string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5 */

    @Test(enabled = true)
    public void testCase3(){

        String str = "Java J2EE Java JSP J2EE";
        char[] chr = str.toCharArray();
        Map<Character, Integer> dup = new HashMap<Character, Integer>() ;
        for(Character ch : chr){
            if(dup.containsKey(ch)){
                dup.put(ch,dup.get(ch)+1);
            }
            else
                dup.put(ch,1);
        }
        Set<Character> keys = dup.keySet();
        for(Character ch : keys){
            if(dup.get(ch)>1) {
                    System.out.println(ch + " is " + dup.get(ch) + " times repeated");
            }
              else
                System.out.println(ch + " is " + dup.get(ch) + " time repeated");
        }
    }

 /*   4. Write a java program to find all pairs of elements in the given array whose sum is equal to a given number. 
    For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
    then you have to find all pairs of elements in this array whose sum must be 20.
    In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20 */

    @Test(enabled = true)
    public void testCase4(){
        int[] input = {4, 5, 7, 11, 9, 13, 8, 12};
        int sum=20;
        for(int i=0; i<input.length;i++){
            for(int j=i+1; j<input.length;j++){
               if(input[i] + input[j] == sum)
                   System.out.println("pairs are " + input[i] + "," + input[j]);
            }
        }
    }

    /*Write a java program to find continuous sub array of the given array whose sum is equal to a given number.
    For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number,
    then you have to find continuous sub array in this array such that whose elements add up to 45.
    In this case, {5, 31, 9} is such sub array whose elements add up to 45*/

    //todo test case
    @Test(enabled = true)
    public void testCase5(){
        int [] input = {12, 5, 31, 9, 21, 8};
        int sum = 45;
        int count = 0 ;
        for( int i : input){
            count += i;
            System.out.println("sum of values of " + i + " is " + count);
            if(count <= sum) {
                System.out.println(count + " < " + sum);
                continue;
            }
        }
    }

  /*  6. Write a java program to check whether given number is binary or not. 
    A binary number is a number which contains only 0 or 1.
    For example : 101101, 110010110, 10010011 are binary numbers */

    @Test(enabled = true)
    public void testCase6(int number){
        boolean isBinary = true;
        int inputs=number;
        System.out.println("inputs are " + inputs);
        while (inputs !=0){
            int temp = inputs%10;
            System.out.println("temp value is :" + temp);
            if(temp>1)
            {
                isBinary=false;
                break;
            }
            else {
                inputs = inputs / 10;
                System.out.println("inputs are :" + inputs);
            }
        }
        if(isBinary)
            System.out.println("the number" + number +" is a binary");
        else
            System.out.println("the number" + number +" is not a binary");
    }
    public void main(String[] args){
        testCase6(128956);
        testCase6(110010110);
}

/*7. Write a java program to check whether one string is a rotation of another.
    For example, If “JavaJ2eeStrutsHibernate” is a string then some rotated versions of this
    string are “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“*/

@Test(enabled = true)
    public void testCase7(){
    String str = "JavaJ2eeStrutsHibernate";
    int a=4 , b= 8 , c=14;
    String rotate = str.substring(a) + str.substring(0,a);
    System.out.println(str.substring(a) + " : " + str.substring(0,a) + " : " + rotate);
    Assert.assertEquals("J2eeStrutsHibernateJava", rotate);
    String rotate1 = str.substring(b) + str.substring(0,b);
    System.out.println(str.substring(b) + " : " + str.substring(0,b) + " : " + rotate1);
    Assert.assertEquals("StrutsHibernateJavaJ2ee" , rotate1);
    String rotate2 = str.substring(c) + str.substring(0,c);
    System.out.println(str.substring(c) + " : " + str.substring(0,c) + " : " + rotate2);
    Assert.assertEquals("HibernateJavaJ2eeStruts",rotate2);
}

/*8. Write a java program to separate zeros from non-zeros in the given array.
            You have to move zeros either to end of the array or bring them to beginning of the array.
    For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0}
 and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}. */

@Test(enabled = true)
public void testCase8(){
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

/*9. If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements from 1 to n.
    Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once.
            If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}.
    One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.*/

@Test(enabled = true)
    public void testCase9(){
    {
        int a[] = {1, 4, 5, 3, 7, 8, 6 };
        int n = 7 ,i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        System.out.println( total);
    }
}

/*10. Given a string, your code must find out the first repeated as well as non-repeated character in that string.
    For example, if “JavaConceptOfTheDay” is the given string,
    then ‘J’ is a first non-repeated character and ‘a’ is a first repeated character */

    @Test(enabled = true)
    public void testCase10(){
        String str = "JavaConceptOfTheDay";
        char[] chr = str.toCharArray();
        Map<Character, Integer> dup = new HashMap<Character, Integer>() ;
        for(Character ch : chr){
            if(dup.containsKey(ch))
                dup.put(ch,dup.get(ch)+1);
            else
                dup.put(ch,1);
        }
        for(Character ch : chr){
            if(dup.get(ch)>1) {
                System.out.println(ch + " is first repeated character in given string");
                break;
            }
        }
        for(Character ch : chr) {
            if (dup.get(ch) == 1) {
                System.out.println(ch + " is the first non-repeated character in given string");
                break;
            }
        }
}

}

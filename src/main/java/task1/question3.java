package task1;

import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    //3. Given an array A of length N and a number K, find the greatest number in the array A that is smaller than K.

    public static void main(String[] args){
        int[] A = {2,5,4,8,9,55};
        int N = A.length;
        int K = 3;
        int values=0;
        for(int i=0;i<A.length;i++){
            Arrays.sort(A);
        }
        while(K!=0){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter of value of Smaller than K");
            values= Integer.parseInt(s.next());
            for(int i=A.length-1;i>=0;i--)
            {
                if(A[i]<values)
                {
                    System.out.println(A[i]);
                    break;
                }
            }
            K--;
        }
    }
}

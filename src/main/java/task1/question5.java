package task1;

import java.util.Scanner;

// 5. Given a positive integer N. The task is to check if N is a power of 2. That is N is 2x for some x.
public class question5 {

    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String args[]) {
        int TestCases, value = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.of.times you want to verify :  ");
        TestCases = Integer.parseInt(s.next());
        System.out.println("Enter the number to check if it is power of 2 : ");
        while (TestCases != 0) {
            value = s.nextInt();
            if (isPowerOfTwo(value))
                System.out.println("Yes");
            else
                System.out.println("No");
            TestCases--;
        }
    }

        /*boolean flag=false;
        int n=5;
        if (n == 0)
            flag = false;
        while (n != 1) {
            System.out.println("inside while");
            if (n % 2 != 0) {
                System.out.println(" value of n in if " + n);
                flag = false;
            } else {
                System.out.println(" value of n is * " + n);
                n = n / 2;
                System.out.println(" value of n is " + n);
            }
            flag = true;
        }
        if(flag==true)
            System.out.println("given number is power of 2");
        else
            System.out.println("Given number is not power of 2");
    }*/
}

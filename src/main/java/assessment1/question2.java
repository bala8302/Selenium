package assessment1;

import org.junit.Assert;

public class question2 {
    public static void main(String[] args) {
        int a= 5, b=8 , c=6 , d=55, e=9 , f=20, g=3, h=15,i=2 ,n=15;

        int j = -a+b*c;
        System.out.println("result for -a+b*c is : " + j);
        Assert.assertEquals(43,j);

        int k = (d+e) % e ;
        System.out.println(" result for (55+9) % 9 is : " + k );
        Assert.assertEquals(1,k);

        int l= f+ (-g*a / b) ;
        System.out.println(" result for 20 + (-3*5 / 8) is " + l);
        Assert.assertEquals(19,l);

        int m = a+n / g*i - b% g ;
        System.out.println(" result for 5 + 15 / 3 * 2 - 8 % 3 is : " + m);
        Assert.assertEquals(13,m);

    }
}

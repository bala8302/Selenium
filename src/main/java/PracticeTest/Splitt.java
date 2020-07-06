package PracticeTest;

public class Splitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s ="Automation Testing";
String[]arr=s.split(" ");
for(String ss:arr)
{
System.out.println(ss);	
}
int len=s.length();
String rev="";
for(int i=len-1;i>0;--i)
{
	rev+=s.charAt(i);
	
}
	System.out.println(rev);
	
	}

}


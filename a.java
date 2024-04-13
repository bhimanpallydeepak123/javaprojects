
import java.util.Scanner;

 class test6 {
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
	
		String org_str=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			
		rev=rev+str.charAt(i);
		
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("palindrome:");
		}
		else
		{
			System.out.println("not palindrome:");
		}
	}

}

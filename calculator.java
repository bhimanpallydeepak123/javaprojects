import java.util.*;
public class calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("press 1 for add,press 2 for sub,press 3 for mul,press 4 for div,press 5 for mod");
int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
int mod=a%b;
{
System.out.println(sum);
System.out.println(sub);
System.out.println(mul);
System.out.println(div);
System.out.println(mod);
}
}
}

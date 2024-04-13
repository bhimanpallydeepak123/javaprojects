
class A extends Thread
{
public void run()
{
System.out.println("welcome");
}

public static void main(String[] args)
{
A obj=new A();
obj.start();
System.out.println(Thread.currentThread().getPriority());
}
}
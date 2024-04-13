class A
{
int a=10;

}
class B
{
static int b=20;

}
class main
{
public static void main(String[] args)
{
A obj=new A();
B obj=new B();
obj.a();
B.b();
}
}

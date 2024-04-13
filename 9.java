interface A
{
public void draw();
}
class LambdaExpressionExample{
public static void main(String[] args)
{
int width=10;
A d=new A()

{
public void draw()
{
System.out.println("drawing"+width);
}
};
d.draw();
}
}





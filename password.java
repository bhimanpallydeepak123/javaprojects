class Employee
{
private int password;

public void setpassword(int password)
{
if(password>5000)
{
this.password=5000;
}
else if(password<0);
{
this.password=0;
}
else 
{
this.password=password;
}
}
public int getpassword()
{
return password;
}
}
class Main
{
public static void main(String[] args)
{
Employee obj=new Employee;
obj.setpassword(0708);
int x =obj.getpassword();
System.out.println("the password of employee is :"+x);
}
}

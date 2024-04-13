import java.io.FileOutputStream;
 class FileOutputStreamExample
{
public static void main(String[] args)
{
try
{
FileOutputStream fileOutputStream=new FileOutputStream("D:\\testout.txt");
String msg="welcome to java";
byte byteArray[]=msg.getBytes();
fileOutputStream.write(byteArray);

System.out.println("success....");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
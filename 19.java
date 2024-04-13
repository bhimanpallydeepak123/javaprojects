import java.io.FileOutputStream;
 class FileOutputStreamExample{
public static void main(String[] args)
{
try(FileOutputStream fileOutputStream=new FileOutputStream)("D:\\testout.txt");
String msg="hello world java";
byte byteArray[] = msg.getBytes();
fileOutputStream.write(byteArray);
}
}
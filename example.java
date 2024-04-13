public class main
{
public static void main(String[] args)
{
String ur1="jdbc:mysql://localhost:3306/peters";
String uname="root";
String pwd="root";
String query="update student set marks=? where stud_name=?";
try
{
Connection c =DriverManager.getConnection(ur1,uname,pwd);
Student s =c.createStatement();
PreparedStatement pstmt=c.PreparedStatement(query);
pstmt.setInt(1,29);
pstmt.setString(2,"ravi");
int rowsEffected=pstmt.executeUpdate();
System.out.println(rowsEffected);
ResultSet rs=s.executeQuery("select * from student);
System.out.println("stud_id\tstud_name\tmarks\tskill");
while(rs.next())
{
int id=rs.getInt("stud_id");
String name=rs.getString("stud_name");
int marks=rs.getString("marks");
String skill=rs.getString("skill");
System.out.println(id+" "+name+" "+marks+" "+skill);
}
rs.close();
s.close();
c.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}









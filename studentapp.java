class StudentApp
{
int rollNo;
String name;
String branch;
String collegeName;
public static void main(String[] args)
{

StudentApp deepak = new StudentApp();
StudentApp divya = new StudentApp();
StudentApp sunitha = new StudentApp();
StudentApp narsing = new StudentApp();


deepak.rollNo=123;
deepak.branch="ece";
deepak.collegeName="Spec";

divya.rollNo=133;
divya.branch="cse";
divya.collegeName="Spec";

sunitha.rollNo=143;
sunitha.branch="ece";
sunitha.collegeName="Spec";

narsing.rollNo=153;
narsing.branch="cse";
narsing.collegeName="Spec";


System.out.println(deepak.rollNo+" "+deepak.branch+" "+deepak.collegeName);
System.out.println(divya.rollNo+" "+divya.branch+" "+divya.collegeName);
System.out.println(sunitha.rollNo+" "+sunitha.branch+" "+sunitha.collegeName);
System.out.println(narsing.rollNo+" "+narsing.branch+" "+narsing.collegeName);
}
}



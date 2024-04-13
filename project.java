
import java.util.Scanner;

public class project {
	public static void main(String[] args)
	{
		
		int EC=85;
		int M1=80;
		int EG=70;
		int totalmarks1=EC+M1+EG;
		double year1_percentage=totalmarks1*100/300f;
		
		int NA=84;
		int DEVC=78;
		int AP=80;
		int totalmarks2=NA+DEVC+AP;
		double year2_percentage=totalmarks2*100/300f;
		
		int CVTT=65;
		int EDC=78;
		int EMTL=68;
		int totalmarks3=CVTT+EDC+EMTL;
		double year3_percentage=totalmarks3*100/300f;
		
		int VLSI=75;
		int COA=64;
		int SSP=84;
		int totalmarks4=VLSI+COA+EMTL;
		double year4_percentage=totalmarks4*100/300f;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year=");
		int i=s.nextInt();
		switch(i) {
		case 1:
			System.out.println(" First year marks:");
			int A=s.nextInt();
			if(A==1)
			{
				System.out.println("EC:"+EC);
				System.out.println("M1:"+M1);
				System.out.println("EG:"+EG);
				System.out.println("YEAR1_percentage:"+year1_percentage);
				}
			break;
		case 2:
			System.out.println(" Second year marks:");
			int B=s.nextInt();
			if(B==1)
			{
				System.out.println("NA:"+NA);
				System.out.println("DEVC:"+DEVC);
				System.out.println("AP:"+AP);
				System.out.println("YEAR2_percentage:"+year2_percentage);
				}
			break;
		case 3:
			System.out.println(" Third year marks:");
			int C=s.nextInt();
			if(C==1)
			{
				System.out.println("CVTT:"+CVTT);
				System.out.println("EDC:"+EDC);
				System.out.println("EMTL:"+EMTL);
				System.out.println("YEAR3_percentage:"+year3_percentage);
				}
			break;
		case 4:
			System.out.println(" Third year marks:");
			int D=s.nextInt();
			if(D==1)
			{
				System.out.println("VLSI:"+VLSI);
				System.out.println("COA:"+COA);
				System.out.println("SSP:"+SSP);
				System.out.println("YEAR4_percentage:"+year4_percentage);
				}
			break;
		case 5:
		{
			System.out.println("overall_percentage");
			int E=s.nextInt();
			if(E==1) {
				double overall_percentage=(year1_percentage+year2_percentage+year3_percentage+year4_percentage)/4;
				System.out.println("OVERALL_PERCENTAGE:"+overall_percentage);
				
			}
			break;
			}
		}
		}
	}
	
//�����������ɹ����
import java.util.Scanner;
class  ForDemol28
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ������2000����ݣ�");
		int y=s.nextInt();
		while (y<2000)
		{
			System.out.println("��������ȷ����ݣ�");
			System.out.print("�������꣺");
		     y=s.nextInt();
		}
		System.out.print("�������£�");
		int m=s.nextInt();
		while (m>12)
		{
			System.out.println("��������ȷ���·ݣ�");
			System.out.print("�������£�");
		     m=s.nextInt();
		}
		System.out.print("�������գ�");
		int d=s.nextInt();
		while (d>31)
		{
			System.out.println("��������ȷ�����ڣ�");
			System.out.print("�������գ�");
		     m=s.nextInt();	
		 }
		while ((d==31)&&(m!=1&&m!=3&&m!=5&&m!=7&&m!=8&&m!=10&&m!=12))
		{
			System.out.println("��������ȷ�����ڣ�");
			System.out.print("�������գ�");
		     m=s.nextInt();	
		 }
		 while (d==30&&m==2)
		 {
			 System.out.println("��������ȷ�����ڣ�");
			System.out.print("�������գ�");
		     m=s.nextInt();	
		 }
		 while (d==29&&m==2)
		 {
			 if (y%4==0&&y%100!=0||y%400==0)
			 {
				 break;
			 }else
			 {
				 System.out.println("�������ݲ�������2��û��29�����������룡");
			System.out.print("�������գ�");
		     m=s.nextInt();
			 }
		 }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 int sum=0;
		 for (int i=2000 ; i<y;i++)
		 {
			
				 if (i%4==0&&i%100!=0||i%400==0)
				 {
					 sum+=366;
				 }else
					 sum+=365;
			 
		 }
		switch (m-1)
		{
		case 11:
			sum+=30;
		case 10:
			sum+=31;
		case 9:
			sum+=30;
		case 8:
			sum+=31;
		case 7:
			sum+=31;
		case 6:
			sum+=30;
		case 5:
			sum+=31;
		case 4:
			sum+=30;
		case 3:
			sum+=31;
		case 2:
			if (y%4==0&&y%100!=0||y%400==0)
			{
			sum+=29;
			}else
				sum+=28;
        case 1:
			sum+=31;

		
		}
		sum+=d;
		System.out.println("��������ھ���2000��1��1��  "+sum+"��");
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      if (sum%5>=1&&sum%5<=3)
      {
		  System.out.println("��һ�����ڴ��㣡");
      }else
		  System.out.println("��һ������ɹ����");
	}
}

import java.util.Scanner;
class  SwitchDemol1
{
	public static void main(String[] args) 
	{   System.out.println("���������ռ�����һ���Ѿ���ȥ������");
		Scanner s=new Scanner(System.in);
		System.out.print("��������:");
		int y=s.nextInt();
		if (y>2017);
		{
			System.out.print("��������ȷ�����");
			
		}
		System.out.print("�������£�");
		int m=s.nextInt();
		if (m>12)
		{
			System.out.println("��������ȷ���·�");
		}
		
		System.out.print("�������գ�");
		int d=s.nextInt();
		if (d>2017)
		{
			System.out.println("��������ȷ������");
		}
	
		int sum=0;
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
		System.out.println(y+"��"+m+"��"+d+"��"+"���ѹ�ȥ������Ϊ"+sum+"��.");
	}
}

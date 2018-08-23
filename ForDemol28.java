//三天打鱼两天晒网。
import java.util.Scanner;
class  ForDemol28
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个大于2000的年份：");
		int y=s.nextInt();
		while (y<2000)
		{
			System.out.println("请输入正确的年份！");
			System.out.print("请输入年：");
		     y=s.nextInt();
		}
		System.out.print("请输入月：");
		int m=s.nextInt();
		while (m>12)
		{
			System.out.println("请输入正确的月份！");
			System.out.print("请输入月：");
		     m=s.nextInt();
		}
		System.out.print("请输入日：");
		int d=s.nextInt();
		while (d>31)
		{
			System.out.println("请输入正确的日期！");
			System.out.print("请输入日：");
		     m=s.nextInt();	
		 }
		while ((d==31)&&(m!=1&&m!=3&&m!=5&&m!=7&&m!=8&&m!=10&&m!=12))
		{
			System.out.println("请输入正确的日期！");
			System.out.print("请输入日：");
		     m=s.nextInt();	
		 }
		 while (d==30&&m==2)
		 {
			 System.out.println("请输入正确的日期！");
			System.out.print("请输入日：");
		     m=s.nextInt();	
		 }
		 while (d==29&&m==2)
		 {
			 if (y%4==0&&y%100!=0||y%400==0)
			 {
				 break;
			 }else
			 {
				 System.out.println("输入的年份不是闰年2月没有29日请重新输入！");
			System.out.print("请输入日：");
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
		System.out.println("输入的日期距离2000年1月1日  "+sum+"天");
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      if (sum%5>=1&&sum%5<=3)
      {
		  System.out.println("这一天是在打鱼！");
      }else
		  System.out.println("这一天是在晒网！");
	}
}

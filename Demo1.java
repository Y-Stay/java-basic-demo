import java.util.*;
class Demo1 
{
	public static void main(String[] args) 
	{
		int[][] roomNumber=new int[12][10];
		for(int i=0;i<12;i++)
		{
			for (int j=0;j<10 ; j++)
			{	
					roomNumber[i][j]=((i+1)*100)+(j+1);							 
			}
		}
		String[][] room=new String[12][10];
		System.out.println("欢迎光临黄金大酒店！");
		printbangzhu();
		for (int i=0;i>=0 ;i++ )
		{
			Scanner s=new Scanner(System.in);
		String x=s.next();
	
		    if (x.equals("quit"))
		    {
				System.out.println("感谢您的光临，再见！");
				break;
		    }
			else if (x.equals("chaxun"))
				
			{
				print(roomNumber,room);
				System.out.println();
				System.out.println("查询完毕，请选择其他功能。");
				System.out.println();
				//printbangzhu();
			}
			else if (x.equals("chushihua"))
			{
				chushihua(room);
				System.out.println("初始化完毕，请选择其他功能。");
				//printbangzhu();
			}
			else if (x.equals("in"))
			{
				
				for (int j=1;j>0 ;j++ )
				{
					Scanner t=new Scanner(System.in);
				System.out.print("请输入要入住的房间号：");
                int inNumb=t.nextInt();
				if(inNumb==0)
					{
					System.out.println("请选择其他功能");
					//printbangzhu();
					break;
					}
					
					else if (chafang(room,inNumb))
				{
					System.out.print("请输入"+inNumb+"号房间入住人员姓名：");
					String inName=t.next();
				in(room,inNumb,inName);
				break;
				} 
				else
					{
			        System.out.println("此房间已有人入住，请重新输入。");
					continue;}
				}				
			}
			else if (x.equals("out"))
			{
				
				for (int j=1;j>0 ;j++ )
				{
					Scanner t=new Scanner(System.in);
				System.out.print("请输入要退的房间号：");
                int inNumb=t.nextInt();
				//String butui=t.next();
				if(inNumb==0)
					{
					System.out.println("请选择其他功能");
					//printbangzhu();
					break;
					}
					if (chafang(room,inNumb)==false)
				{
					out(room,inNumb);
				break;
				}
				else
					{
			        System.out.println("此房间没有人住，无需退房");
					continue;}
					
				}				
			}
			else
				System.out.println("您的输入有误，请重新输入。");
			    

		}
		//System.out.println(查询房间请输入
		//print(roomNumber,room);

	}
	public static void print(int[][] a,String[][] b)
	{
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(i+1+"楼房间:");
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+"\t");
			}
			for (int k=0;k<a[i].length ;k++ )
			{
				System.out.print(b[i][k]+"\t");
			}
			System.out.println();
		}
	}
	public static void chushihua(String[][] a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				a[i][j]="empty";
			}
		}
	}
	public static void in(String[][]a,int b,String c)
	{     //101 1001
		int i=b%100;
		int j=b/100;
		if (a[j-1][i-1].equals("empty"))
		{
			a[j-1][i-1]=c;
			System.out.println("恭喜你，入住成功！请选择其他功能。");
				//printbangzhu();
		}
		
		
	}
	public static boolean chafang(String[][]a,int b)
	{
      int i=b%100;
		int j=b/100;
		if (a[j-1][i-1].equals("empty"))
		{
			return true;
		
		}
		return false;
		
	}
	public static void out(String[][]a,int b)
	{
		int i=b%100;
		int j=b/100;
		
		
			System.out.println("恭喜你，退房成功！请选择其他功能。");
		     a[j-1][i-1]="empty";
			 //printbangzhu();
		
	}
	public static void printbangzhu()
	{
            
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println("查询房间请输入 chaxun             *");
		System.out.println("入住房间请输入 in                 *");
		System.out.println("退房请输入 out                    *");
		System.out.println("退出入住或者退房功能请输入0       *");
		System.out.println("退出本系统请输入quit              *");

		System.out.println("* * * * * * * * * * * * * * * * * *");
	}
}

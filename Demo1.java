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
		System.out.println("��ӭ���ٻƽ��Ƶ꣡");
		printbangzhu();
		for (int i=0;i>=0 ;i++ )
		{
			Scanner s=new Scanner(System.in);
		String x=s.next();
	
		    if (x.equals("quit"))
		    {
				System.out.println("��л���Ĺ��٣��ټ���");
				break;
		    }
			else if (x.equals("chaxun"))
				
			{
				print(roomNumber,room);
				System.out.println();
				System.out.println("��ѯ��ϣ���ѡ���������ܡ�");
				System.out.println();
				//printbangzhu();
			}
			else if (x.equals("chushihua"))
			{
				chushihua(room);
				System.out.println("��ʼ����ϣ���ѡ���������ܡ�");
				//printbangzhu();
			}
			else if (x.equals("in"))
			{
				
				for (int j=1;j>0 ;j++ )
				{
					Scanner t=new Scanner(System.in);
				System.out.print("������Ҫ��ס�ķ���ţ�");
                int inNumb=t.nextInt();
				if(inNumb==0)
					{
					System.out.println("��ѡ����������");
					//printbangzhu();
					break;
					}
					
					else if (chafang(room,inNumb))
				{
					System.out.print("������"+inNumb+"�ŷ�����ס��Ա������");
					String inName=t.next();
				in(room,inNumb,inName);
				break;
				} 
				else
					{
			        System.out.println("�˷�����������ס�����������롣");
					continue;}
				}				
			}
			else if (x.equals("out"))
			{
				
				for (int j=1;j>0 ;j++ )
				{
					Scanner t=new Scanner(System.in);
				System.out.print("������Ҫ�˵ķ���ţ�");
                int inNumb=t.nextInt();
				//String butui=t.next();
				if(inNumb==0)
					{
					System.out.println("��ѡ����������");
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
			        System.out.println("�˷���û����ס�������˷�");
					continue;}
					
				}				
			}
			else
				System.out.println("���������������������롣");
			    

		}
		//System.out.println(��ѯ����������
		//print(roomNumber,room);

	}
	public static void print(int[][] a,String[][] b)
	{
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(i+1+"¥����:");
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
			System.out.println("��ϲ�㣬��ס�ɹ�����ѡ���������ܡ�");
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
		
		
			System.out.println("��ϲ�㣬�˷��ɹ�����ѡ���������ܡ�");
		     a[j-1][i-1]="empty";
			 //printbangzhu();
		
	}
	public static void printbangzhu()
	{
            
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println("��ѯ���������� chaxun             *");
		System.out.println("��ס���������� in                 *");
		System.out.println("�˷������� out                    *");
		System.out.println("�˳���ס�����˷�����������0       *");
		System.out.println("�˳���ϵͳ������quit              *");

		System.out.println("* * * * * * * * * * * * * * * * * *");
	}
}

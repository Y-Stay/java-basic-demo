/*
1������һ��������ʽ�ֽ�
   ������90 �õ�90=2*3*3*5
     ����80 �õ�80=2*2*2*2*5
	 ˼·����n%i==0�жϵ�ǰ��i�ǲ���n��һ������
	          ����� ��n=n/i;���i
		      ��ǰ����һ����������count=0  count++
		      ���count>0 �����*
           ������� ��i++

*/import java.util.Scanner;
class  ForDemol19
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("������һ������:");
		int n=s.nextInt();
		System.out.print(n+"=");
		int count=0;
		int t=n;
		for (int i=2;i<=t/2 ; )
		{
			if (n%i==0)
			{
				if (count>0)
				{
					System.out.print("*");
				}
				n=n/i;
				System.out.print(i);
                count++;	
             }
			 else
			{ 
				 i++;
			}
		}
		//�ж�����������ǲ���һ������ 
		int j;
		
		for (j=2;j<=t/2 ;j++ )
		{
			if (j%t==0)
			{
				break;
			}
	    }
		if (j==t/2+1)//��������������"1*"+t
			{
				System.out.println("1*"+t);
			}
	    if (t==1)
			{
				System.out.println("1*1");
			}
		}

}

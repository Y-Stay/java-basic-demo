//����һ�����֣��ж����Ƿ�Ϊ������������
import java.util.Scanner;
class  ForDemol8
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ������");
		int n=s.nextInt();
		int i;
		for ( i=2;i<=n/2 ; )
		{
			if (n%i==0)
			{
				break;
			}

		}
		if (i==n/2+1)
		{
			System.out.println(n+"Ϊ����");
		}else
        { 
			System.out.println(n+"��������");
        }     
	}
}

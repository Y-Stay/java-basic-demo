//����һ�����ִ�ӡ�����������Ӱ���1�������Լ� ���������������
import java.util.Scanner;
class  ForDemol6
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ������:");
		int n=s.nextInt();
		int sum=1;
		for (int i=1;i<n ;i++ )
		{
			if (n%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("��������֮��Ϊ��");
	}
}

/*��֪faibonacci��쳲����������е�ǰ�������ֱ�Ϊ0��1,1,2,3,5,8.......��
   �ӵ����ʼ��ÿһ�����ǰ����֮�͡�
   ����һ������n����������е�ǰn��ĺ͡�
   ע�⣺����������Ǵ�0��ʼ�ġ�
   */
import java.util.Scanner;
class  ForDemol24
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int n=s.nextInt();
		System.out.print("쳲��������е�ǰ"+n+"���Ϊ:");
		int sum=1;
		int a=0,b=1,x;
		if (n==1)
		{
			System.out.println("0");
		}
		else if (n==2)
		{
			System.out.println("1");
		}
		else if (n>=3)
		{
		for (int i=3;i<=n ; i++)
		{
            x=a+b;
			sum+=x;
			a=b;
			b=x;
		}
		System.out.println(sum);
		}
	}
}

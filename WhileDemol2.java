//����һ���������������λ������֮��
//�� forѭ��Ҳ��
import java.util.Scanner;
class  WhileDemol2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ����λ���֣�");
		/*int n=s.nextInt();
		int sum=0;
		while (n!=0)
		{
			sum+=n%10;
			n=n/10;
		}*/
		int sum=0;
		for (int n=s.nextInt();n!=0 ;n/=10 )
		{
			sum+=n%10;
		}
		System.out.println("������λ֮��Ϊ��"+sum);
	}
}

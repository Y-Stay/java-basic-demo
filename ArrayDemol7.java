/*��һ��������������
    �������Ƿ��絽һ���������1Ҳ�����Լ�
	*/
import java.util.*;
class  ArrayDemol7
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ������:");
		int n=s.nextInt();
		
		System.out.println(Arrays.toString (arraySons(n)));
	}
	public static int countSons(int a)
	{
		int count=0;
		for (int i=1;i<=a ; i++)
		{
			if (a%i==0)
				count++;
		}
		return count;
	}
	public static int[] arraySons(int n)
	{
		int [] a=new int[countSons(n)];
		int t=0;
		for (int i=1;i<=n;i++ )
		{
			if (n%i==0)
			{
				a[t]=i;
				t++;
			}
		}
		return a;
	}
}

/*��ˮ�ɻ�������νˮ�ɻ�������ָһ����λ��abc���������a3+b3+c3=abc��
   ��a��3�η�����abc��ˮ�ɻ�������ӡ����ˮ�ɻ���
   */
class ForDemol20 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		for (int i=100;i<=999 ;i++ )
		{
			a=i%10;
			b=i/10%10;
			c=i/100;
			if ((a*a*a)+(b*b*b)+(c*c*c)==i)
			{
				System.out.println(i);
			}
		}
	}
}

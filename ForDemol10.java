//��ӡ100��1000��������,��������
class  ForDemol10
{
	public static void main(String[] args) 
	{
		int n,i;
		int sum=0;
		int count=0;
		//���г�101��1000��ȷ���ǲ�������������
		for (n=101;n<1000 ;n+=2 )
		{
			//�ж��ǲ���������������break�������for
			for (i=2;i<=n/2 ;i++ )
			{
				if (n%i==0)
				{
					break;
				}
			}
			if (i>n/2)//���n�ǲ�������
			{   //n��������ǰ����ִ���������
				count++;
				System.out.print(n+" ");
				if (count%5==0)
				{
					System.out.println();
				}
				if (n==997)
				{
					System.out.println();
				}
				sum+=n;
			}
			
		}
		System.out.println("100��1000���������ĺ�Ϊ��"+sum);
	}
}

//��ӡ��100��1000֮����������
//
class  ForDemol9
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=100;a<=1000 ;a++ )
		{
			for (b=2;b<=a ;b++ )
			{
				if (a%b==0)
				{
					break;
				}
			}
			if (b==a)
			{
				System.out.println(a);
			}
			
		}
	}
}

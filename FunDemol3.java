/*��ӡ10��1000֮�������λ֮����5����
    �������λ������͹���д�ɺ���
    ��������ֵ����Ϊint
    FunDemol3
	*/
class FunDemol3 
{
	public static void main(String[] args) 
	{
		for (int i=10;i<=1000 ;i++ )
		{
			int t=getSum(i);
			if (t==5)
			{
				System.out.println(i+"��");
			}
		}
	}
	public static int getSum(int n)
	{
		int sum=0;
		
        while (n!=0)
        {
          sum+=n%10;
		  n/=10;
        }
		return sum;
	}
}

/*
��ӡ��100��1000֮�����������
    ���ж�����д�ɺ���
	��������ֵ����Ϊboolean
	*/
class FunDemol2 
{
	public static void main(String[] args) 
	{
		for (int i=100;i<=1000 ;i++ )
		{
			if (judge(i)==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static boolean judge(int n)
    {
		for (int i=2;i<=n/2 ;i++ )
		{
          if (n%i==0)
          {
			return false;
          }
		}
		return true;
	}
}

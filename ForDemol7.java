//�԰��Ӱ���
class  ForDemol7
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
			if (i==5)
			{
				System.out.println("��5�����ӵ��������Ҳ���");
				continue;
			}
			if (i==8)
			{
				System.out.println("��8�������ҳԲ����ˣ�������");
				break;
			}
			System.out.println("�ҳԵ�"+i+"������");
		}
		System.out.println("�緹����");
	}
}

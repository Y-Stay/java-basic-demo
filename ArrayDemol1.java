class ArrayDemol1 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,7};//��������ʼ��һ������
		System.out.println(a[0]);//���ʵ�һ������Ԫ��
		System.out.println(a[1]);//���ʵڶ�������Ԫ��
		//������һ������ length ����ĳ���
		System.out.println(a.length);//��ӡ����ĳ���
	    for (int i=0;i<a.length ; i++)//���������ÿһλԪ��
	    {
			System.out.print(a[i]+" ");
	    }
			System.out.println();
        int[] b;//����һ������
		b=new int[]{1,2,3,4,5,6,7,8};//��ʼ��һ������
		for (int i=0;i<b.length ;i++ )//�����������b
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		int[] c=new int[6];//����һ��6��Ԫ�ص�����c û�и�ֵ��Ĭ����0
		c[0]=1;
		c[1]=2;
		for (int i=0;i<c.length ; i++)
		{
			System.out.print(c[i]+" ");
		}
		

	}
}

//forѭ��������ṹ
class ForDemol15 
{
	public static void main(String[] args) 
	{
		int i;
		for (i=1;i<=100 ;i++ );
		System.out.println(i);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int sum=0;   
		  //int j;
		/*for (j=1;j<=100 ;j++ )      1-100�ĺ�
		{
			
			sum+=j;
		}*/
		int j=1;
		/*for (;j<=100 ;j++ )//ʡ�Ե�һ�����ʽ
		{
			sum+=j;
		} */
		/*for (; ;j++ )// ʡ�Ե�һ�͵ڶ������ʽ
		{
			if (j>100)
			{
				break;
			}
			sum+=j;
		} */
		for (; ; )  //ʡ�Ե�һ�ڶ����������ʽ
		{
			if (j>100)
			{
				break;
			}
			sum+=j;
			j++;
         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 for (; ; )  //��ѭ��
		 {
			 System.out.println("hello");
		 }
		}



		System.out.println(sum);
		
	}
}

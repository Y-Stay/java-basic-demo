//for循环的特殊结构
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
		/*for (j=1;j<=100 ;j++ )      1-100的和
		{
			
			sum+=j;
		}*/
		int j=1;
		/*for (;j<=100 ;j++ )//省略第一个表达式
		{
			sum+=j;
		} */
		/*for (; ;j++ )// 省略第一和第二个表达式
		{
			if (j>100)
			{
				break;
			}
			sum+=j;
		} */
		for (; ; )  //省略第一第二第三个表达式
		{
			if (j>100)
			{
				break;
			}
			sum+=j;
			j++;
         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 for (; ; )  //死循环
		 {
			 System.out.println("hello");
		 }
		}



		System.out.println(sum);
		
	}
}

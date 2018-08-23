/*如果一个数等于其所有因子之和，我们称这个数为完数，
   例如 6的因子为1、2、3   6=1+2+3  6就是个完数
   请打印出1000以内所有的完数
   注意 定义sum的位置
   */
class ForDemol22 
{
	public static void main(String[] args) 
	{
		 int sum,i,j;
	     for (i=1;i<=1000 ;i++ )
	     {
			  sum=0;
			 for (j=1;j<i ;j++ )
			 {
				
				 if (i%j==0)
				 {
					 sum+=j;
					 //System.out.println("i="+i);
					// System.out.println("sum="+sum);
					
				 }
				    
				
			 }
			    if (sum==i)
					 {
						 System.out.println(sum);
					     
					 }
	     }
	}
}

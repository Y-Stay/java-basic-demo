/*搬砖问题：36块砖， 36人搬，男搬4，女搬3，两个小孩抬1砖
   问男女和小孩各若干（要求三种都有）*/
class  ForDemol27
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<9 ;i++ )
		{
			for (j=1;j<12 ;j++ )
			{   k=1;
				k=36-i-j;
				if (k%2==0)
				{
					System.out.println(i+" "+j+" "+k);
				}
				
				/*if (i*4+j*3+k/2==36&&k%2==0)
				{
					System.out.println(i+" "+j+" "+k);
				}*/

			}
		}
	}
}

/*���һ������������������֮�ͣ����ǳ������Ϊ������
   ���� 6������Ϊ1��2��3   6=1+2+3  6���Ǹ�����
   ���ӡ��1000�������е�����
   ע�� ����sum��λ��
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

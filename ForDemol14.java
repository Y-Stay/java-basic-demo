/*��Ǯ��ټ�  100ԪǮ��100ֻ��
  ����3Ԫ/ֻ ĸ��2Ԫ/ֻ С��1Ԫ2ֻ
  ���� i    ĸ��  j    С��  k
  i=1 ʱ   j=1  / j=2 / j=3 .......j=49
  ......
  ......
  i=33    ...........
  */
class ForDemol14
  
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<=33 ;i++ )
		{
			for (j=1;j<=49 ;j++ )
			{
				k=100-i-j;
				if (k%2==0&&(3*i+2*j+k/2)==100)
				{
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
	}
}

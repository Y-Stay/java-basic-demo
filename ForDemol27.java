/*��ש���⣺36��ש�� 36�˰ᣬ�а�4��Ů��3������С��̧1ש
   ����Ů��С�������ɣ�Ҫ�����ֶ��У�*/
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

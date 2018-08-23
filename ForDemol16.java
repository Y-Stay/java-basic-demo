//break Ðø
class ForDemol16
{
	public static void main(String[] args) 
	{
		out:for (int i=1;i<=10 ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				if (j==3)
				{
					break out;
				}
				System.out.print(i+","+j+" ");
			}
			System.out.println();
		}
	}
}

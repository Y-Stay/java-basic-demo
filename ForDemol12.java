/* ¥Ú”°
      *
     **
    ***
   ****
  *****
 ******
*******
*/
class ForDemol12 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<=7 ;i++ )
		{
			for (j=1;j<=7-i ;j++ )
			{
				System.out.print(" ");
			}
			for (k=1;k<=i ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

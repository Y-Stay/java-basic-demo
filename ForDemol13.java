class ForDemol13 
//l�൱�������ж��ٸ���ͬ��ͼ����m�൱���ж��ٸ������ж��ٸ�ͼ��-1
/*
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
	  */
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (int l=1;l<=5 ;l++ )
		{
		
		for (i=1;i<=6;i++ )
		{
			for (j=1;j<=7-i ; j++)
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1 ;k++ )
			{
				System.out.print("*");
			}
			for (int m=1;m<=4 ;m++ )
			{
			
			for (j=1;j<=2*(7-i)+1 ; j++)
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1 ;k++ )
			{
				System.out.print("*");
			}
			}
		

				System.out.println();
				
			
				
		}
		for (i=7;i>=1 ; i--)
		{
			for (j=1;j<=7-i ;j++ )
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1 ;k++ )
			{
				System.out.print("*");
			}
			for (int m=1;m<=4 ;m++ )
			{
			
			for (j=1;j<=2*(7-i)+1 ;j++ )
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1 ;k++ )
			{
				System.out.print("*");
			}
			}
			System.out.println();
        
		}
		}
		System.out.println("bye==bye");
	}
}

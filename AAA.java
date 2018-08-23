class AAA 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=a;
		b++;
		System.out.println("a="+a+",b="+b);
		int[]c={1,2,3};
		int[]d=c;
		for (int i=0;i<d.length ;i++ )
		{
			d[i]++;
			System.out.println("c="+c[i]+",d="+d[i]);
		}
		

	}
}

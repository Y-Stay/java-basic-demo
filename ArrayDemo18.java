class ArrayDemo18 
{
	public static void main(String[] args) 
	{
		int a[][][]={
			{
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
			},
			{
				{1,2,3,4},
				{100,2,3,4,6,7,8},
				{1,2,3,4},
				{1,2,3,4},
			},
			{
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
			}

		};
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[1][1].length);
		System.out.println(a[1][1][0]);
	}
}

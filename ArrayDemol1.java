class ArrayDemol1 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,7};//声明并初始化一个数组
		System.out.println(a[0]);//访问第一个数组元素
		System.out.println(a[1]);//访问第二个数组元素
		//数组有一个属性 length 数组的长度
		System.out.println(a.length);//打印数组的长度
	    for (int i=0;i<a.length ; i++)//便历数组的每一位元素
	    {
			System.out.print(a[i]+" ");
	    }
			System.out.println();
        int[] b;//声明一个数组
		b=new int[]{1,2,3,4,5,6,7,8};//初始化一个数组
		for (int i=0;i<b.length ;i++ )//便历这个数组b
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		int[] c=new int[6];//声明一个6个元素的数组c 没有赋值的默认是0
		c[0]=1;
		c[1]=2;
		for (int i=0;i<c.length ; i++)
		{
			System.out.print(c[i]+" ");
		}
		

	}
}

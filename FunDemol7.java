//µÝ¹éº¯Êý Ð´6µÄ½×³Ë
class FunDemol7 
{
	public static void main(String[] args) 
	{
		System.out.println(jiecheng(6));
	}
	public static long jiecheng(int n)
	{
		if (n==1)
		{
			return 1;
		}

		return jiecheng(n-1)*n;
	}
}

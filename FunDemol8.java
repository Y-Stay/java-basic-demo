//递归算法写出一个函数求出第n项斐波那契数列的值
//1，1,2,3,5,8,13,21,34，。。。。。
class  FunDemol8
{
	public static void main(String[] args) 
	{
		System.out.println(getNDate(9));
	}
	public static int getNDate(int n)
	{
		if (n==1||n==2)
		{
			return 1;
		}
	  return	getNDate(n-1)+getNDate(n-2);
	}
}

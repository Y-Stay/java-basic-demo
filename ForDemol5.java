//1!+2!+3！。。。。。100！=多少
class  ForDemol5
{
	public static void main(String[] args) 
	{
		long sum=1;//阶乘的只会比较大所用用long定义自变量
		long n=1;
		for (int i=1;i<=100 ;i++ )
		{
           n*=i;
		   System.out.println(i+"的阶乘为："+n);
		   sum+=n;
		}
		System.out.println("1到100的阶乘之和为："+sum);
	}
}

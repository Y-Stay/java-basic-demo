//输入两个整数，求它们的最大公因数。 最小公倍数
   
import java.util.*;
class ArrayDemol9 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		int x=s.nextInt();
		System.out.print("请输入第二个数字：");
		int y=s.nextInt();
		//int x=6,y=9;
		print(x,y);
	}
	public static void print(int a,int b)
	{
		int[] x1=ArrayDemol7.arraySons(a);
		System.out.println("第一个数字的因子为:"+Arrays.toString(x1));
		int[] x2= ArrayDemol7.arraySons(b);
		System.out.println("第一个数字的因子为:"+Arrays.toString(x2));
		int max=ArrayDemol8.zuida(x1,x2);
		System.out.println("他们的最大公约数为："+ArrayDemol8.zuida(x1,x2));
		System.out.println("最小公倍数为："+(a*b)/max);
	}
}

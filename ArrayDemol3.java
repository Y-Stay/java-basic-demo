/*创建一个数组并初始化
    倒置这个数组的 元素
	首尾相换 以此类推
	*/
import java.util.*;
class ArrayDemol3
{
	public static void main(String[] args)
	{
		int[] a=new int[6];
		Scanner s=new Scanner(System.in);
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print("请输入数组的第"+(i+1)+"个元素");
			a[i]=s.nextInt();
		}
		System.out.println("输入的数组为："+Arrays.toString(a));
		for (int i=0;i<a.length/2 ;i++ )
		{
			int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		System.out.println("数组倒置后为："+Arrays.toString(a));
		
	}
}
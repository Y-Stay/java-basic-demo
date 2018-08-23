//获取两个正整数数组的形同且最大的元素
import java.util.*;
class ArrayDemol8 
{
	public static void main(String[] args) 
	{
		int[] a={2,3,4,5,7,8,9,10};
		int[] b={3,5,6,7,8,10,11,12};
	
		System.out.println(zuida(a,b));
	}
	public static int zuida(int[] a,int[] b)
	{
		int max=a[0];
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<b.length ;j++ )
			{
				if (a[i]==b[j]&&a[i]>max)
				{
					max=a[i];
				}
			}
		}
		return max;
	}
}

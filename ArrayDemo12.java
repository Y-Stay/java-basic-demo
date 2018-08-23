//数组的选择排序
import java.util.*;
class ArrayDemo12 
{
	public static void main(String[] args) 
	{
		int[] a={2,5,6,1,8,4,7};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	}
}

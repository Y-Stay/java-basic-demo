import java.util.*;
class ArrayDemo14 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,4,5,6};
		a=insertValue(a,3);
		System.out.println(Arrays.toString(a));
		int[] b={4,7,1,3,5,2,6};
		sort(b);
		System.out.println(Arrays.toString(b));

	}
	public static int[] insertValue(int[] a,int b)
	{
	    a=Arrays.copyOf(a,a.length+1);
		int i;
		for (i=a.length-2;i>=0 ;i-- )
		{
			if (a[i]>b)
			{
				a[i+1]=a[i];
			}else
				break;
		}
		a[i+1]=b;
		return a;
	}
	public static void sort(int[] a)
	{
		//int[] b={4,7,1,3,5,2,6};
		//int t,j;
		for (int i=1;i<a.length ;i++ )
		{
		
			for (int j=i-1;j>=0&&a[j+1]<a[j] ; j--)
			{
				int t=a[j+1];
				a[j+1]=a[j];
				a[j]=t;
			}
		}
		
	}

}
/* a[0] a[1] a[2] a[3] a[4] a[5]
   
   a[0]作为基本量 拿a[1]进行插入工作 a[0] a[1] 已经排好序了

   a[0] a[1] 作为基本量 拿a[2]进行插入工作 a[0] a[1] a[2] 已经排好序了

   。。。。。。。。。

   */
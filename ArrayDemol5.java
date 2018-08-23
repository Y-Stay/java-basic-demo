import java.util.*;
class ArrayDemol5 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6};
		int max=a[0];
		int min=a[0];
		int sum=0;
		for (int i=0;i<a.length;i++ )
		{
			if (max<a[i])
			{
				max=a[i];
			}
			if (min>a[i])
			{
				min=a[i];
			}
			sum+=a[i];
		}
		System.out.println(max+" "+min+" "+sum);
		for (int i=0;i<a.length-1 ;i++ )
		{
			a[i]=a[i+1];
		}
		//a[a.length-1]=0;
		System.out.println(Arrays.toString(a));
	}
}

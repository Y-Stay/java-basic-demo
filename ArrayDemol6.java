//дһ�����Ե�������ĺ�����ע���費��Ҫ����ֵ
import java.util.*;
class ArrayDemol6 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		System.out.println(Arrays.toString(reverseArray(a)));
	}
	public static int[] reverseArray(int[] a)
	{
		for (int i=0;i<a.length/2 ;i++ )
		{
			int t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
			
		}
		return a;
	}
}

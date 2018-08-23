//数组的冒泡排序
import java.util.*;
class  ArrayDemo13
{
	public static void main(String[] args) 
	{
		int[] a={3,6,2,5,7,4,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a)
	{
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=0;j<a.length-i-1 ;j++ )
			{
				if (a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
}

/*先用a[0]和a[1]比如果a[0]>a[1]则交换，小则不变
  然后a[1]和a[2]比如果a[1]>a[2]则交换，小则不变
  。。。。。。。
  a[a.length-2]和a[a.length-1]比如果大则交换
  经过这一轮 最终把数组中最大的放入了a[a.length-1]

  然后进行第二轮
          第三轮
		  。。。。。
		  最终a[0]和a[1]比
*/

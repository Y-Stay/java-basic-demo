//�����ð������
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

/*����a[0]��a[1]�����a[0]>a[1]�򽻻���С�򲻱�
  Ȼ��a[1]��a[2]�����a[1]>a[2]�򽻻���С�򲻱�
  ��������������
  a[a.length-2]��a[a.length-1]��������򽻻�
  ������һ�� ���հ����������ķ�����a[a.length-1]

  Ȼ����еڶ���
          ������
		  ����������
		  ����a[0]��a[1]��
*/

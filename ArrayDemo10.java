//��ʼ��һ�����飬������ĵ���λ����100
//�������ٲ���
import java.util.Arrays;
class ArrayDemo10 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int[] b=new int[11];
		for (int i=0;i<a.length ;i++ )
		{
			b[i]=a[i];
		}
		a=b;
		for (int i=a.length-1;i>3 ;i-- )
		{
			a[i]=a[i-1];
		}
		a[3]=100;
		System.out.println(Arrays.toString(a));
	}
}

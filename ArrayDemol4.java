//��ϰ��������������
import java.util.*;
class ArrayDemol4
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4};
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(Arrays.toString(a));
		int[] b;
		b=new int []{2,3,4};
		System.out.println(Arrays.toString(b));
		int []c=new int[]{3,3,3,3};
        System.out.println(Arrays.toString(c));
		int[] d=new int[5];
		Scanner s=new Scanner(System.in);
		for (int i=0;i<d.length ;i++ )
		{
			System.out.print("����������d�ĵ�"+(i+1)+"��Ԫ��");
			d[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(d));
	}
}
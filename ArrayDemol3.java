/*����һ�����鲢��ʼ��
    ������������ Ԫ��
	��β�໻ �Դ�����
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
			System.out.print("����������ĵ�"+(i+1)+"��Ԫ��");
			a[i]=s.nextInt();
		}
		System.out.println("���������Ϊ��"+Arrays.toString(a));
		for (int i=0;i<a.length/2 ;i++ )
		{
			int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		System.out.println("���鵹�ú�Ϊ��"+Arrays.toString(a));
		
	}
}
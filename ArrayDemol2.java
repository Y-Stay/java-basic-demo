import java.util.Scanner;
class ArrayDemol2 
{
	public static void main(String[] args) 
	{
		int [] a=new int[6];
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print("����������ĵ�"+(i+1)+"��Ԫ�أ�");
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
			sum+=a[i];
		}
		int max=a[0],min=a[0];
		for (int i=1;i<a.length ;i++ )
		{
			if(max<a[i])
				max=a[i];
			if (min>a[i])
			    min=a[i];	
		}
         double avg=(double)sum/ a.length;
		 System.out.println("���������ĺ�Ϊ��"+sum+"���ֵΪ��"+max+"��СֵΪ��"+min+"ƽ��ֵΪ��"+avg);
}
}

//�������������������ǵ���������� ��С������
   
import java.util.*;
class ArrayDemol9 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		int x=s.nextInt();
		System.out.print("������ڶ������֣�");
		int y=s.nextInt();
		//int x=6,y=9;
		print(x,y);
	}
	public static void print(int a,int b)
	{
		int[] x1=ArrayDemol7.arraySons(a);
		System.out.println("��һ�����ֵ�����Ϊ:"+Arrays.toString(x1));
		int[] x2= ArrayDemol7.arraySons(b);
		System.out.println("��һ�����ֵ�����Ϊ:"+Arrays.toString(x2));
		int max=ArrayDemol8.zuida(x1,x2);
		System.out.println("���ǵ����Լ��Ϊ��"+ArrayDemol8.zuida(x1,x2));
		System.out.println("��С������Ϊ��"+(a*b)/max);
	}
}

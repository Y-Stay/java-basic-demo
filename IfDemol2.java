import java.util.Scanner;
class  IfDemol2 ///////������������ �ҳ����������һ����
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("��һ����");
		 int a=s.nextInt();
		System.out.print("�ڶ�����");
		 int b=s.nextInt();
		System.out.print("��������");
		 int c=s.nextInt();
		 //����һ
		/*1���ȱȽ�a��b�����a>b�򲻱䣬��a<b��a��b����
		  2���ٱȽ�a��c����a>c���䣬��a<c,��a��c����
		  3�����a��Ϊ���ֵ*/
		  
		 if (a<b)
		 {
			 int d=a;
			 a=b;
			 b=d;
		 }
	     if (a<c)
	     {
			 int d=a;
			 a=c;
			 c=d;
	     }
		 System.out.println("���ֵΪ"+a);
		 //������
		 /*1������int�ַ� max ����a��ֵ���� ����a��������
		   2��max��b�Ƚ�max<b ��max=b
		   3��max��c�Ƚ�max<c ��max=c*/

		 int max=a;
		 if (max<b)
		 {
			 max=b;
		 }
         if (max<c)
         {
			 max=c;
         } 
		System.out.println("���ֵΪ"+max);
	}
}

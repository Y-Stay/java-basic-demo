import java.util.Scanner;
class  IfDemol3 //�����������֣�����С�����˳�����
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("������������������");
		System.out.print("��һ������");
		int a=s.nextInt();
		System.out.print("�ڶ�������");
		int b=s.nextInt();
		System.out.print("����������");
		int c=s.nextInt();
		/*˼·1������a>b>c  
		      2���Ƚ�a��b�� a>b �򲻱� ��a<b��a��b����
			  3���Ƚ�a��c�� a>c �򲻱� ��a<c��a��c����
			  4���Ƚ�b��c�� b>c �򲻱� ��b<c��b��c����
			  5�����ս��a>b>c*/
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
		if (b<c)
		{
			int d=b;
			b=c;
			c=d;
		}
		System.out.println("��������С�����˳��Ϊ:"+c+","+b+","+a);



	}
}

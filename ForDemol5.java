//1!+2!+3������������100��=����
class  ForDemol5
{
	public static void main(String[] args) 
	{
		long sum=1;//�׳˵�ֻ��Ƚϴ�������long�����Ա���
		long n=1;
		for (int i=1;i<=100 ;i++ )
		{
           n*=i;
		   System.out.println(i+"�Ľ׳�Ϊ��"+n);
		   sum+=n;
		}
		System.out.println("1��100�Ľ׳�֮��Ϊ��"+sum);
	}
}

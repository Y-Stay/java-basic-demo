//����һ������ �������ֵ���
/*���赹�ù���������Ϊt
  �������λ����ֵ ��ֵ��t
  Ȼ��n%10�ǲ��ǵ���0  ȡ��λ��������λ������	ǰ���Ǳ仯�е�n�����ǲ��ǵ���0
  �������0
  ���λ��*10����ʮλ������Ŀǰ��λ���õĽ��
  Ȼ��ѽ����ֵ��t
  �ڿ�n%10�ǲ��ǵ���0
  ���Ǽ����ظ��������
  */
import java.util.Scanner;
class  WhileDemol3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("������һ����λ���֣�");
		int n=s.nextInt();
		int t=0;
		while (n!=0)
		{
          t=t*10+n%10;
		   n/=10;
		}
		System.out.println(t);

	}
}

import java.util.Scanner;
class  SwitchDemol3
{
	public static void main(String[] args) 
	{   System.out.println("����һ���ɼ������㣬���á�������switch�����");
		Scanner s=new Scanner(System.in);
		System.out.print("������ɼ�:");
		int n=s.nextInt();
		switch (n/10)
		{
		case 1:
        case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
		break;
		case 6:
			System.out.println("����");
        break;
		case 7:
			System.out.println("һ��");
        break;
		case 8:
			System.out.println("����");
          break;
		case 9:
        case 10:
			System.out.println("����");
        break;

		default:
			System.out.println("���벻�Ϸ�");

		
		}
	}
}

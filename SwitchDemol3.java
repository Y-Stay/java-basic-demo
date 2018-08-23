import java.util.Scanner;
class  SwitchDemol3
{
	public static void main(String[] args) 
	{   System.out.println("输入一个成绩，优秀，良好、、、用switch语句做");
		Scanner s=new Scanner(System.in);
		System.out.print("请输入成绩:");
		int n=s.nextInt();
		switch (n/10)
		{
		case 1:
        case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不及格");
		break;
		case 6:
			System.out.println("几个");
        break;
		case 7:
			System.out.println("一般");
        break;
		case 8:
			System.out.println("良好");
          break;
		case 9:
        case 10:
			System.out.println("优秀");
        break;

		default:
			System.out.println("输入不合法");

		
		}
	}
}

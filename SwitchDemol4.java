import java.util.Scanner;
class SwitchDemol4 
{
	public static void main(String[] args) 
	{
		System.out.println("输入中文匹配");
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个名字:");
		String n=s.next();
		switch (n)
		{
		case "贠媛媛":
			System.out.println("高晓源的老婆！");
		break;
		default:
			System.out.println("你是谁！");
		
		}
	}
}

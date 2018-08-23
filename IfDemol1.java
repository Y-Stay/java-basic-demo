import java.util.Scanner;//导入键盘输入的包
class IfDemol1 //输入一个数字若大于70输出老年人bye-bye！ 若小于等于70则输出bye-bye!
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);//创建一个s获取键盘所输入的
		System.out.print("请输入年龄：");
	int a=s.nextInt();//将输入的数值赋给a
		
			if (a>70)
			{
			System.out.println("老年人");
			}
			System.out.println("bye-bye!");
	}
}

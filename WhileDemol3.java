//输入一个数字 将该数字倒置
/*假设倒置过来的数字为t
  先求出个位数数值 赋值给t
  然后看n%10是不是等于0  取多位数各个数位的数字	前提是变化中的n最终是不是等于0
  如果不是0
  则个位数*10加上十位数就是目前两位倒置的结果
  然后把结果赋值给t
  在看n%10是不是等于0
  不是继续重复上面操作
  */
import java.util.Scanner;
class  WhileDemol3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个多位数字：");
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

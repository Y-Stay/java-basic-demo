
/*
1、输入一个数，因式分解
   如输入90 得到90=2*3*3*5
     输入80 得到80=2*2*2*2*5
	 思路：从2往后用*依次相连每一个因子
	 用count计数因子个数
	 当count大于0时证明有两个或两个以上因子 输出*

*/
import java.util.Scanner;
public class ForDemol18 {
    public static void main(String[] args) 
		{
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int n = scan.nextInt();
        int count = 0;
		int t=n;
        System.out.print(t + "=");
        for (int i=2;i<=t/2;) 
			{            
            if (t % i == 0) 
				{
                if (count > 0) 
					{
                    System.out.print("*");
                    }
                t= t/i;
                System.out.print(i);
                count++;
                }
            else {
                i++;
                 }
        }
        if (count == 1) {
            System.out.print("*1");
        }
        else if (count < 1) {
            System.out.print("1*1");
        }
        System.out.println();
    }
}
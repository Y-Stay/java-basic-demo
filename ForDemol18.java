
/*
1������һ��������ʽ�ֽ�
   ������90 �õ�90=2*3*3*5
     ����80 �õ�80=2*2*2*2*5
	 ˼·����2������*��������ÿһ������
	 ��count�������Ӹ���
	 ��count����0ʱ֤���������������������� ���*

*/
import java.util.Scanner;
public class ForDemol18 {
    public static void main(String[] args) 
		{
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ������:");
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
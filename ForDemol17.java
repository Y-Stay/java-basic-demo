/*
1������һ��������ʽ�ֽ�
   ������90 �õ�90=2*3*3*5
     ����80 �õ�80=2*2*2*2*5
	 ˼·��
*/
import java.util.Scanner;
public class ForDemol17 {
    public static void main(String[] args) 
		{
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ������:");
        int input = scan.nextInt();
        int i = 2;
        int count = 0;
        System.out.print(input + "=");
        while (input >= i) 
			{            
            if (input % i == 0) 
				{
                if (count > 0) 
					{
                    System.out.print("*");
                    }
                input = input/i;
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
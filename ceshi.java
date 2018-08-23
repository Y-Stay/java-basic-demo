import java.util.Scanner;
class ceshi 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=0;
		while(n!=0)
		{
			t=t*10+n%10;
            n/=10; 
		}
		System.out.println(t);
	}
}

import java.util.*;
class ArrayDemo16 
{
	public static void main(String[] args) 
	{
		int[][] a={
			{1,2,3,4,5},
			{5,6,7},
			{8,9},
		};
			int[][] b=new int[][]{{1,2,3},{4,5,6}};
			//��ά����ĳ��Ⱦ�������һά����ĸ���
		System.out.println(a.length);
		//a��������һά���飬��һ���������ֽ�a[0];
		//�ڶ����������ֽ�a[1]
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(Arrays.toString(a[i]));
		}
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
}

import java.util.Arrays;
class ArrayDemo11 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		int[] b=new int[6];
		System.arraycopy(a,0,b,0,a.length);
		int[] c=new int[8];
		System.arraycopy(a,2,c,4,3);
		System.out.println(Arrays.toString(c));
	}
}

class ClassDemo17 
{
	public static void main(String[] args) 
	{
		String[] str=new String[]{"hello", "word"};
		Arg.main(str);
	}
}
class Arg
{
	public static void main(String[] args)
	{
		System.out.println("bye-bye");
		for (int i=0;i<args.length ;i++ )
		{
			System.out.println(args[i]);
		}
	}
}
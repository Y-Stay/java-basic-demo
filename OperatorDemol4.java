class  OperatorDemol4
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		boolean f=a>=5&&a<20;
		//boolean f1=a++>20&&b-->10;
		boolean f2=a++>5||b--<30;
        boolean f3=!f2;
		System.out.println(f2+",b="+b+",!f2="+f3);
	}
}

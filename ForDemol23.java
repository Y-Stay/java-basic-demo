class  Fordemol23
{
	public static void main(String[] args) 
	{
		int n=1000;
int r,j,i;
for(i=1;i<=n; i++)
	{
r = 0;
for(j=1;j<i;j++)
	{
if(i%j == 0)
	{
r = r + j;
     }
    }
if(r == i){
System.out.println(r);
}
}
	
}
}

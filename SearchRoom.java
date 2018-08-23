import java.util.*;
class  SearchRoom
{
	public static void main(String[] args) 
	{
		String room[][]=new String[12][10];
		search(room);
     }
	 public static void search(String[][] room)
	{
		 for (int i=0;i<room.length ;i++ )
		 {
			 for(int j=0;j<room[i].length;j++)
			 {
				 if (i<9)
				 {
					 System.out.print("0");
				 }
				 int roomNo=(i+1)*100+j+1;
				 System.out.print(roomNo+"\t");
			 }
			
			 for(int k=0;k<room[i].length;k++)
			 {
				 System.out.print(room[i][k]+"\t");
			 }
			  System.out.println();
		 }
	 }
	
}

 class ForDemol25
 {  public static void main(String[] args) 
	 {
	 public int fnType2(int n){
  int result=-1;
  int temp1=0;
  int temp2=1;
  for(int index=0;index<=n;index++){
   if(index==0){
    result=temp1;
   }else if(index==1){
    result=temp2;
   }else{
    result=temp1+temp2;
    if(result<0){
     result=-2;
     break;
    }
    temp1=temp2;
    temp2=result;
   }
  }
  return result;
 }
	 }
 }
import java.util.Scanner;
 
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ��ӡǰ�������쳲���������");
        int n = sc.nextInt();
        printFibonacci(n);
    }
     
    static void printFibonacci(int n){
        int firstNum = 1;
        int secNum = 1;
        if(n>=1){
            System.out.print(firstNum+" ");
        }
        if(n>=2){
            System.out.print(secNum+" ");
        }
        for(int i=3;i<=n;i++){
            int temp = firstNum+secNum;
            System.out.print(temp+" ");
            firstNum = secNum;
            secNum = temp;
        }
    }
}
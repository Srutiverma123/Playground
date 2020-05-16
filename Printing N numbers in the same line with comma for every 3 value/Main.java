import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();int k=0;
    for(int i=1;i<=n;i++){
      if(k==3){
      k=0;
        System.out.print(",");i--;
      }
      else
      { System.out.print(i);
    k++;}
    }
  
    
    
  }
}
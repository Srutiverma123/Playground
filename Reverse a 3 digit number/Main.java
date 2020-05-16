import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
int r=n1%10;
    r=r*100;
    n1=n1/10;
    int t=n1%10;
    t=t*10;n1=n1/10;
    int sum=r+t+n1;
            System.out.println(sum);

	
  }
}
import java.util.Scanner;
class Main
{
  public static int sq(int n){
  return n*n;}
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sq(n));
	} 
}
import java.util.Scanner;
class Main{
  public static int great(int n1,int n2){
  if(n1>n2)
    return n1;
    return n2;
  }
	public static void main (String[] args){
	    // Type your code here
           Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
       n1=great(n1,n2);
      n2=great(n1,n3);
      System.out.print(n2);
	}
}
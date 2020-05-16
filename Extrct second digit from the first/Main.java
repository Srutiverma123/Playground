import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     int r;
      while(n>100){
      //  r=n%10;
       // sum=sum+r;
      n=n/10;
      }
    //  int sum=r+n;
      r=n%10;
      System.out.println(r);
	
	}
}
import java.util.Scanner;
class Main{
  public static int great(int a,int b){
    
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return great(a-b, b); 
        return great(a, b-a); 
    
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
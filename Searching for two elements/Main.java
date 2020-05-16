import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
      a[i]=in.nextInt();
      }
      int b=in.nextInt();
       int c=in.nextInt();      int flag=0;

      for(int i=0;i<n;i++){
       if(a[i]==b)
       { System.out.println(i);flag=1;}
      }
     if(flag==0)
              System.out.println(-1);
       flag=0;

      for(int i=0;i<n;i++){
       if(a[i]==c)
       {System.out.println(i);flag=1;}
      }
      if(flag==0)
              System.out.println(-1);

    }
}
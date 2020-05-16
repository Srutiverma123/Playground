import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
              Scanner in = new Scanner(System.in);
		int avg=in.nextInt();
       if(avg>=85)
        {
            System.out.println("A");
        }
        else if(avg>=75)
        {
           System.out.println("B");
        } 
        else if(avg>=65)
        {
            System.out.println("C");
        }
        else if(avg>=55)
        {
            System.out.println("D");
 
        }
      else if(avg>=45)
        System.out.println("E");
      else
                System.out.println("Fail");


    }
}
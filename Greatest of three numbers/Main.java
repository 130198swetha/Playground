import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();
    if(a>b)
    {
      if(a>c)
       {
         System.out.println(a);
        }
    }
      if(c>a)
      {
        if(c>b)
        {
          System.out.println(c);
        }
      }
    }
}
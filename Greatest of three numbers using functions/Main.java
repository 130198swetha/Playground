import java.util.Scanner;
public class Main{
	public static void main (String[] args)
    {
    Scanner in = new Scanner(System.in);
     int x = in.nextInt();
   int  y = in.nextInt();
   int z = in.nextInt();
 if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else if (z > x && z > y)
      System.out.println(z);
    else
      System.out.println("The numbers are not distinct.");
    }
}
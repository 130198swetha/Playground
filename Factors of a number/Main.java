import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int ip=1;ip<=n;ip++)
      {
        if(n%ip==0)
        {
System.out.println(ip);
        }
      }
	}
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();
      for(int cur_row = 1;cur_row <= num;cur_row++)
      {
        for(int cur_col = 1;cur_col<=num;cur_col++)
        {
          System.out.print(cur_row);
        }
        System.out.println();
      }
	}
}
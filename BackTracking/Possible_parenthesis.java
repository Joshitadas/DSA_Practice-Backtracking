import java.util.*;
public class Main
{
//   public static void display()  
  public static void solve (char[]ans, int n, int open, int close, int point)
  {
	if (open == n && close == n)
	  {
	  System.out.println(new String(ans));
	  }
	  else{
	      if(open < n && point < 2*n){
	          ans[point] = '(';
	          solve (ans, n, open+1, close, point+1);
	      }
	      if(close < open && point < 2*n){
	          ans[point] = ')';
	          solve (ans, n, open, close+1, point+1);
	      }
	  }

  }
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
	char[] ans = new char[2*n];
	int open = 0, close = 0;



	solve (ans, n, open, close, 0);		// parameters are the matrix, len of column, len of col, current row, current column
  }
}

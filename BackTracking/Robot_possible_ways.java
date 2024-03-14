import java.util.*;
public class Main
{
  public static void display (int[][]mat, int n, int m)
  {
	System.out.println ("Solution");
	for (int i = 0; i < n; i++)
	  {
		for (int j = 0; j < m; j++)
		  {
			System.out.print (mat[i][j] + " ");
		  }
		System.out.println ("");
	  }
  }
  public static void solve (int[][]mat, int m, int n, int x, int y)
  {

	//base case as when current row and column is the final row and column mean the robot reached the final destination
	if (x == n - 1 && y == m - 1)
	  {
		display (mat, n, m);
	  }
	else
	  {
		//forward moving
		int next_x, next_y;		// at given time we check if the next block is possible or not hence we calc the next_x, next_y
		next_x = x;
		next_y = y + 1;

		if (next_x <= n - 1 && next_y <= m - 1)
		  {						// condition for checkinhif moving forward is possible or not
			mat[next_x][next_y] = 1;	// in this possibility we take the next step and calculate possiblities after that;
			solve (mat, m, n, x, y + 1);	// function call after taking the next step
			mat[next_x][next_y] = 0;	// this line is important for backtracking as now we assign the next step that we had previously marked as taken tonot taken
		  }

		//right moving
		// int next_x, next_y;
		next_x = x + 1;
		next_y = y;

		if (next_x <= n - 1 && next_y <= m - 1)
		  {
			mat[next_x][next_y] = 1;
			solve (mat, m, n, x + 1, y);
			mat[next_x][next_y] = 0;
		  }
	  }
  }
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
	int m = sc.nextInt ();
	int[][] mat = new int[n][m];
	mat[0][0] = 1;				//assigning to 1 as the robot is initially placed in (0,0)


	solve (mat, m, n, 0, 0);	// parameters are the matrix, len of column, len of col, current row, current column
  }
}

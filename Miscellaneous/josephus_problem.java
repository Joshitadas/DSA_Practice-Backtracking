import java.util.*;

public class Main
{
    public int solve()
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.println(n- (1<<((Math.floor(Math.log(n)/Math.log(2)))*2+1)));
	}
}

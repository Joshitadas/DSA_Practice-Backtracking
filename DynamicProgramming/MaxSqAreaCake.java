import java.util.*; 
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        int N,M; 
        N=sc.nextInt();
        M=sc.nextInt(); 
        int[][] mat=new int[N][M]; 
        int[][] dp=new int[N][M];  
        int i,j; 
        for(i=0;i<=N-1;i++)
        {
            for(j=0;j<=M-1;j++)
            {
                mat[i][j]=sc.nextInt(); 
            }
        }
        for(i=0;i<=N-1;i++)
        {
            for(j=0;j<=M-1;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=mat[i][j];
                }
                else 
                {
                    if(mat[i][j]==0)
                    {
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=Math.min((Math.min(dp[i-1][j],dp[i-1][j-1])),(dp[i][j-1]))+1;
                    }
                }
            }
        }
        int max=0; 
        for(i=0;i<=N-1;i++)
        {
            for(j=0;j<=M-1;j++)
            {
                if(max<dp[i][j])
                {
                    max=dp[i][j]; 
                }
            }
        }
      System.out.print(max);   
    }
}

class Solution {
    //sdot 5 - dp
    public int longestPalindromeSubseq(String s) {
        int l = s.length();
        int dp[][] = new int[l][l];

        int itr = 1,row,col;
        for(itr = 1;itr<=l;itr++){
            for(row=0;row<=l-itr;row++){
                col = row+itr-1;
                if(row==col){
                    dp[row][col] = 1;
                }
                else if(s.charAt(row)==s.charAt(col)){
                    dp[row][col] = 2+ dp[row+1][col-1]; //bottom diagonal
                }
                else{
                    dp[row][col] = Math.max(dp[row][col-1], dp[row+1][col]);
                }
            }
        }

        return dp[0][l-1];
    }
}

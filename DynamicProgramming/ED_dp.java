class Solution {
    //sdot 6 - using DP
    public int minDistance(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();

        int[][] dp = new int[l1+1][l2+1];

        int row,col;

        for(row=0;row<=l1;row++){
            for(col=0;col<=l2;col++){
                if(row==0){
                    dp[row][col] = col;
                }
                else if(col==0){
                    dp[row][col] = row;
                }
                else if(s1.charAt(row-1)==s2.charAt(col-1)){
                    dp[row][col] = 0 + dp[row-1][col-1];
                }
                else{
                    dp[row][col] = Math.min(dp[row-1][col-1], Math.min(dp[row-1][col], dp[row][col-1])) + 1;
                }
            }

        }

        return dp[l1][l2];

    }
}

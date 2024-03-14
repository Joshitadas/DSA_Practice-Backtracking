class Solution {
    //sdot 6 - dp on grids (USING RECURSION)
    public int helper(int m,int n,int r, int c){
        // decrement i to move up, j to move left
        if(r==0 && c==0){ //reached origin
            return 1;
        }
        else if(r==-1||c==-1){ //beyond the grid
            return 0;
        }
        else{
            int up = helper(m,n,r-1, c);
            int left = helper(m,n,r,c-1);
            return up + left;
        }  
    }

    //using recursion 
    public int uniquePaths(int m, int n) {
        return helper(m,n,m-1,n-1);
    }
}

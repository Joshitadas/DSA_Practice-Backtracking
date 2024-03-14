class Solution {
    public int solve(int[][] grid, int n, int m, int row, int col, int count){
        if(row<0||row>=n || col< 0 || col>=m || grid[row][col]==-1) return 0;

        if(grid[row][col] == 2){
            if(count==0){
                return 1;
            }
            else{
                return 0;
            }
            
        }
        int temp = grid[row][col];

        grid[row][col] = -1;
        count--;

        int path = solve(grid,n,m,row-1,col,count)+
        solve(grid,n,m,row+1,col,count)+
        solve(grid,n,m,row,col-1,count)+
        solve(grid,n,m,row,col+1,count);

        grid[row][col] = temp;
        count++;
        return path;

    }

    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int row=0,col=0;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    row=i;
                    col=j;
                    count++;
                }
                else if(grid[i][j]==0){
                    count++;
                }
            }
        }

        return solve(grid,n,m,row,col,count);
    }
}

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] mat = new int[n][amount + 1];
        int i, j;
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= amount; j++) {
                if (i == 0) {
                    if (j % coins[0] == 0) {
                        mat[i][j] = j / coins[0];
                    } else {
                        mat[i][j] = ((int) (Math.pow(2, 31)) - 1);
                    }
                } else {
                    int not_take = 0 + mat[i - 1][j];
                    int take = (int) (Math.pow(2, 31)) - 1;
                    if (coins[i] <= j) {
                        take = 1 + mat[i][j - coins[i]];
                    }
                    mat[i][j] = Math.min(take, not_take);
                }

            }
        }
        if (mat[n - 1][amount] != ((int) (Math.pow(2, 31)) - 1)) {
            return mat[n - 1][amount];
        } else {
            return -1;
        }
    }
}

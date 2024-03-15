class Solution {
    public int solve(int[] coins, int i, int j) {
        if(i == 0){
        if (j % coins[i] == 0) {
            return (j / coins[i]);
        } else
           { return (int) (Math.pow(2, 31)) - 1;}}
        
        int not_take = 0 + solve(coins, i - 1, j);
        int take = (int) (Math.pow(2, 31)) - 1;
        if (coins[i] <= j) {
            take = 1 + solve(coins, i, (j - coins[i]));
        }
        return Math.min(take, not_take);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int res = solve(coins, n-1, amount);

        if(res != (int) (Math.pow(2, 31)) - 1){
            return res;
        }

        return -1;

    }
}

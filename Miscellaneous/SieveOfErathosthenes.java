class Solution {
    // sdot - DAY 3 - sieve of erathosthenes
    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }

        int[] arr = new int[n - 1];
        for (int i = 0; i <= n - 2; i++) {
            arr[i] = i + 2;
        }

        int sq = (int) (Math.sqrt(n));

        for (int i = 0; arr[i] <= sq; i++) {
            if (arr[i] != -1) {
                for (int j = arr[i] * arr[i] - 2; j <= n - 2; j = j + arr[i]) {
                    arr[j] = -1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] != -1) {
                // System.out.print(arr[i]);
                count++;
            }
        }

        if (arr[n - 2] == n) {
            count--;
        }

        return count;
    }
}

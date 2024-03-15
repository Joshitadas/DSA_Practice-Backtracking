class Solution {
    // sdot - DAY 3 - sieve of erathosthenes
    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }

        int m = (n - 1) / 2;
        int i, j, z;

        int[] s = new int[m];
        for (i = 0; i < m; i++) {
            s[i] = i + 1;
        }
        i = 1;
        j = 1;
        z = 0;

        while (true) {
            z = i + j + 2 * i * j;
            if (i == j && z > m) {
                break;
            } else if (z <= m) {
                s[z - 1] = -1;
                j++;
            } else {
                i++;
                j = i;
            }
        }

        int count = 1;

        for (i = 0; i < m; i++) {
            if (s[i] != -1) {
                // System.out.println(2*s[i]+1);
                count++;
            }
        }

        if (2 * s[m - 1] + 1 == n) {
            count--;
        }

        return count;
    }
}

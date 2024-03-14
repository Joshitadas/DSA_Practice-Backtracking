class Solution {
    public boolean solve(int row, int col, String word, int count, boolean[][] visited, char[][] board) {
        int n = board.length;
        int m = board[0].length;
        if (count == word.length()) {
            return true;
        }
        if (row < 0 || row >= n || col < 0 || col >= m || visited[row][col] || board[row][col] != word.charAt(count))
            return false;

        visited[row][col] = true;

        boolean nextword = solve(row + 1, col, word, count + 1, visited, board) ||
                solve(row - 1, col, word, count + 1, visited, board) ||
                solve(row, col + 1, word, count + 1, visited, board) ||
                solve(row, col - 1, word, count + 1, visited, board);

        visited[row][col] = false;

        return nextword;

    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        int row = 0, col = 0;

        boolean[][] visited = new boolean[n][m];

        for (row = 0; row < n; row++) {
            for (col = 0; col < m; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (solve(row, col, word, 0, visited, board)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

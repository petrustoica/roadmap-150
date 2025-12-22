class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] a = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    a[board[i][j] - '1'] += 1;
                    if (a[board[i][j] - '1'] == 2)
                        return false;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            int[] a = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    a[board[j][i] - '1'] += 1;
                    if (a[board[j][i] - '1'] == 2)
                        return false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] a = new int[9];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i * 3 + k][j * 3 + l] == '.')
                            continue;
                        a[board[i * 3 + k][j * 3 + l] - '1'] += 1;
                        if(a[board[i * 3 + k][j * 3 + l] - '1'] == 2)
                            return false;
                    }
                }   
            }
        }
        return true;
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (board[i][j] == '.')
                    continue;

                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i].contains(board[i][j]))
                    return false;

                if (cols[j].contains(board[i][j]))
                    return false;

                if (boxes[boxIndex].contains(board[i][j]))
                    return false;

                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                boxes[boxIndex].add(board[i][j]);
            }
        }

        return true;
    }
}
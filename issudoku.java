public class issudoku {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(board));
    }
    static int[][] board = {
        { 5, 3, 0,  0, 7, 0,  0, 0, 0 },
        { 6, 0, 0,  1, 9, 5,  0, 0, 0 },
        { 0, 9, 8,  0, 0, 0,  0, 6, 0 },

        { 8, 0, 0,  0, 6, 0,  0, 0, 3 },
        { 4, 0, 0,  8, 0, 3,  0, 0, 1 },
        { 7, 0, 0,  0, 2, 0,  0, 0, 6 },

        { 0, 6, 0,  0, 0, 0,  2, 8, 0 },
        { 0, 0, 0,  4, 1, 9,  0, 0, 5 },
        { 0, 0, 0,  0, 8, 0,  0, 7, 9 }
    };
    public static boolean isValidSudoku(int[][] board) {
        int value;
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                value=board[row][col];
                // EXIT IF NUMBER IS PRESENT IN CURRENT ROW
                for (int i = 0; i < 9; i++) {
                    if (board[row][i] == value && i!=col) {
                        return false;
                    }
                }
                // EXIT IF NUMBER IS PRESENT IN CURRENT COLUMN
                for (int i = 0; i < 9; i++) {
                    if (board[i][col] == value && i!=row) {
                        return false;
                    }
                }
                int startRow = row - row % 3;
                int startCol = col - col % 3;
                // EXIT IF NUMBER IS PRESENT IN CURRENT BLOCK
                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startCol; j < startCol + 3; j++) {
                        if (board[i][j] == value && (i!=row||j!=col)) {
                            return false;
                        }
                    }
                }
            }
        }
    return true;
    }
}

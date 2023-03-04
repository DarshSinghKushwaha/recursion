// PROGRAM TO SOLVE SUDOKU USING BACKTRACKING
public class Sudoku {
    static int[][] board = {
            { 9, 0, 0, 7, 8, 0, 0, 3, 0 },
            { 8, 5, 1, 4, 0, 9, 2, 0, 0 },
            { 4, 0, 3, 5, 0, 0, 0, 0, 0 },

            { 6, 0, 0, 0, 0, 0, 7, 4, 0 },
            { 0, 0, 4, 0, 0, 8, 6, 1, 0 },
            { 0, 0, 0, 0, 0, 4, 0, 0, 0 },

            { 3, 4, 2, 1, 9, 5, 8, 0, 7 },
            { 0, 0, 8, 0, 4, 7, 0, 9, 3 },
            { 1, 0, 7, 0, 6, 0, 5, 0, 0 }
    };

    // FUNCTION TO PRINT SUDOKU BOARD
    static void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // FUNCTION TO CHECK IF NUMBER CAN BE PLACED IN A CELL OR NOT
    static boolean caniPlace(int row, int col, int value) {
        // EXIT IF NUMBER IS PRESENT IN CURRENT ROW
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }
        // EXIT IF NUMBER IS PRESENT IN CURRENT COLUMN
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        // EXIT IF NUMBER IS PRESENT IN CURRENT BLOCK
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }

    // FUNCTION TO SLVE SUDOKU
    static boolean solveSudoku(int row, int col) {
        // IF WHOLE ROW IS TRAVERSED JUMP TO NEXT ROW AND RESET COL VALUE TO 0
        if (col == board.length) {
            row = row + 1;
            col = 0;
        }
        // EXIT CONDITION
        if (row == board.length) {
            return true;
        }
        // IF CELL IS NOT EMPTY
        if (board[row][col] != 0) {
            return solveSudoku(row, col + 1); // Move to Next cell
        }
        // CHECK FOR EVERY NO. TO PLACE IN CELL
        for (int i = 1; i <= 9; i++) {
            if (caniPlace(row, col, i)) {
                // PLACE NUMBER
                board[row][col] = i;
                // RECURSIVE CALL FOR REMAINING CELLS IN ROWS
                boolean result = solveSudoku(row, col + 1);
                // IF ALL OK THEN RETURN RESULT
                if (result) {
                    return result;
                }
                board[row][col] = 0; // backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String result = solveSudoku(0, 0) ? "solved" : "notsolved";
        System.out.println(result);
        print();
    }
}
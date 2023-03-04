import java.util.ArrayList;
import java.util.List;

public class nqueen {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static  List<List<String>> solve(int n) {
        List<List<String>> boards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, boards, 0);
        return boards;
    }

    public static  void helper(char[][] board, List<List<String>> boards, int col) {
        if (col == board.length) {
            saveboard(board, boards);
            return;
        }
        for (int row = 0; row < board.length; row++){
            if (issafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, boards, col + 1);
                board[row][col]='.';
            }
        }
    }

    public static boolean issafe(int row, int col, char[][] board) {
        // horizontally
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        // vertically
        for (int j = 0; j < board[0].length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveboard(char[][] board, List<List<String>> boards) {
        String row = "";
        List<String> newboard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newboard.add(row);
        }
        boards.add(newboard);
    }
}

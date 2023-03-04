// PROGRAM TO Count ALL PATHS IN A BOARDMAZE 
public class countpath {
    public static int count(int i, int j, int n, int m) {
        // EXIT IF LAST CELL IN ROW OR COLUMN
        if (n == i || j == m) {
            return 0;
        }
        // EXIT CONDITION
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // RECURSIVE CALL
        return count(i + 1, j, n, m) + count(i, j + 1, n, m);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(count(0, 0, n, m));
    }
}
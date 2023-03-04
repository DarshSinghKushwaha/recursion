// PROGRAM TO COUNT PATHS TO TRAVERSE A BOARDMAZE 
public class Recursion3 {

    public static int countPaths(int i, int j, int n, int m) {
        // EXIT CONDITION
        if (i == n && j == m) {
            if (i == m - 1 || j == n - 1) {
                return 1;
            }
        }
        // RECURSIVE CALL
        return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);

    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(countPaths(0, 0, n, m));
    }
}
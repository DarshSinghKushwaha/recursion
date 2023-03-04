
// PROGRAM TO CALCULATE ALL PATHS IN A BOARDMAZE & STORE IN ARRAYLIST
import java.util.ArrayList;

public class boardmaze {
    static ArrayList<String> getMazePath(int currentRow, int currentColumn, int endRow, int endColumn) {
        // EXIT CONDITION
        if (currentRow == endRow && currentColumn == endColumn) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("\n");
            return temp;
        }
        // EXIT IF TRAVERSE OUTSIDE BOARDMAZE
        if (currentRow > endRow || currentColumn > endColumn) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        ArrayList<String> myResult = new ArrayList<>();
        // RECURSIVE CALL FOR TRAVERSING ROW
        ArrayList<String> horizontalResult = getMazePath(currentRow, currentColumn + 1, endRow, endColumn);
        for (String tempResult : horizontalResult) {
            myResult.add("H " + tempResult);
        }
        // RECURSIVE CALL FOR TRAVERSING COLUMN
        ArrayList<String> verticalResult = getMazePath(currentRow + 1, currentColumn, endRow, endColumn);
        for (String tempResult : verticalResult) {
            myResult.add("V " + tempResult);
        }
        return myResult;
    }

    public static void main(String[] args) {
        System.out.println(getMazePath(0, 0, 3, 3));
        return;
    }
}
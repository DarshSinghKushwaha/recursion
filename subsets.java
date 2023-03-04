
// PROGRAM TO PRINT ALL SUBSETS OF A NUMBER
import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        sub(3, subset);
    }

    public static void sub(int n, ArrayList<Integer> subset) {
        // EXIT CONDITION
        if (n == 0) {
            print(subset);
            return;
        }
        // PRINT SUBSETS WITH CURRENT NUMBER
        subset.add(n);
        sub(n - 1, subset);
        // PRINT SUBSETS WITHOUT CURRENT NUMBER
        subset.remove(subset.size() - 1);
        sub(n - 1, subset);
    }

    public static void print(ArrayList<Integer> subset) {
        for (int index = 0; index < subset.size(); index++) {
            System.out.print(subset.get(index) + " ");
        }
        System.out.println();
    }
}

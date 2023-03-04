// PROGRAM TO CALCULATE WAYS TO CALL GUESTS EITHER IN PAIR OR INDIVIDUALLY
public class callguests {
    public static void main(String[] args) {
        System.out.println(call(4));
    }

    public static int call(int n) {
        // EXIT CONDITION
        if (n <= 1) {
            return 1;
        }
        // RECURSIVE CALL
        return call(n - 1) + ((n - 1) * call(n - 2));
    }
}
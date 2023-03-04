// PROGRAM TO SOLVE TOWER OF HANOI
public class hanoi {
    public static void main(String[] args) {
        tower(3, "source", "helper", "destination");
    }

    public static void tower(int n, String a, String b, String c) {
        // EXIT CONDITION
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + a + " to " + c);
            return;
        }
        // RECURSIVE CALLS
        tower(n - 1, a, c, b);
        System.out.println("transfer disk " + n + " from " + a + " to " + c);
        tower(n - 1, b, a, c);
    }
}

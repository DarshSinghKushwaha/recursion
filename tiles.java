// PROGRAM TO PLACE 1*M TILES IN A PLANE OF N*M
public class tiles {
    public static void main(String[] args) {
        System.out.println(place(4, 2));
    }

    public static int place(int n, int m) {
        // EXIT CONDITION
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // RECURSIVE CALL
        return place(n - m, m) + place(n - 1, m);
    }
}
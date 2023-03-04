// HOW TO CALCULATE GCD OF 2 NUMBERS IN JAVA 
public class gcd {
    public static void main(String[] args) {
        System.out.println(FINDgcd(48, 18));
    }

    public static int FINDgcd(int a, int b) {
        // EXIT CONDITION
        if (b == 0)
            return a;
        // RECURSIVE CALL
        return FINDgcd(b, a % b);
    }
}
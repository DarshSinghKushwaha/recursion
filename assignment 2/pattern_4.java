import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,1);
        sc.close();
    }
    public static void pattern(int r,int i) {
        // BASE CONDITION
        if(r==0){
            return;
        }
        prints(r);
        printn(i);
        System.out.println();
        // RECURSIVE CALL
        pattern(r-1,i+1);
    }
    // PRINT SPACES
    public static void prints(int c) {
        // BASE CONDITION
        if(c==0){
            return;
        }
        System.out.print("  ");
        // RECURSIVE CALL
        prints(c-1);
    }
    // PRINT "* "
    public static void printn(int c) {
        // BASE CONDITION
        if(c==0){
            return;
        }
        System.out.print("* ");
        // RECURSIVE CALL
        printn(c-1);
    }

}
// program to print pattern
//     *
//   * *
// * * *
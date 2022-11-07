import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,1);
        sc.close();
    }
    public static void pattern(int r,int i) {
        if(r==0){
            return;
        }
        prints(r);
        printn(i);
        System.out.println();
        pattern(r-1,i+1);
    }
    public static void prints(int c) {
        if(c==0){
            return;
        }
        System.out.print("  ");
        prints(c-1);
    }
    public static void printn(int c) {
        if(c==0){
            return;
        }
        System.out.print("* ");
        printn(c-1);
    }

}
// program to print pattern
//     *
//   * *
// * * *
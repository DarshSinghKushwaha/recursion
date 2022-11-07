import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        npattern(n,1);
        sc.close();
    }
    public static void npattern(int r,int i) {
        if(r==0){
            return;
        }
        printn(i);
        System.out.println();
        npattern(r-1,i+1);
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
// *
// * *
// * * *
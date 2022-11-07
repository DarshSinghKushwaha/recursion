import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        npattern(n,1,1);
        sc.close();
    }
    public static void npattern(int r,int i,int j) {
        if(r==0){
            return;
        }
        printn(i,r,j);
        System.out.println();
        npattern(r-1,i+1,j);
    }
    public static void printn(int c,int r,int j) {
        if(c==0){
            return;
        }
        System.out.print(j++);
        printn(c-1,r,j);
    }
}
// program to print pattern
// 1
// 12
// 123
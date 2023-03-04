import java.util.Scanner;

public class printdigits {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pd(num);
        sc.close();
    }
    public static void pd(int num){
        if (num!=0) {
        // RECURSION CALL
        pd(num/10);
        System.out.println(num%10);
        }
        return;
    }
}

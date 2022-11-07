import java.util.Scanner;
public class arm {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i = 0; i <=num; i++) {
            if (armstrong(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
public static boolean armstrong(int num) {
        int n=num,sum=0;
        while (n!=0) {                   
            sum+=Math.pow(n%10,3);
            n=n/10;
        }
        if (sum==num) {
            return true;           
        }
        else{
            return false;
        }
    }
}

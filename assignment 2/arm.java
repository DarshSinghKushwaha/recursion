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
        int n=num,sum=0,temp=n,dig=0;
        while (temp>0) {
            temp=temp/10;
            dig++;
        }
        while (n!=0) {                   
            sum+=Math.pow(n%10,dig);
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

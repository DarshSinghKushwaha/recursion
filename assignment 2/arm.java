// PROGRAM TO CHECK IF A NO. IS ARMSTRONG
import java.util.ArrayList;
import java.util.Scanner;
public class arm {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        getarm(num, 1);
        scanner.close();
    }
    static ArrayList<Integer> getarm(int n,int i){
        int sum=0;
        ArrayList<Integer> list = getarm(n, i+1);
        boolean res=armstrong(sum);
        if(res){
            list.add(i);
        }
        return list;
    }
    public static boolean armstrong(int num) {
        int n=num,sum=0,temp=n,dig=0;
        if (num==0) {    
            if (sum==num) {
                return true;           
            }
            return false;
        }
        while (temp>0) {
            temp=temp/10;
            dig++;
        }                  
            sum+=Math.pow(n%10,dig);
            n=n/10;
            return armstrong(num);
    }
}

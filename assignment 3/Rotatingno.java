import java.util.Scanner;

public class Rotatingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();
        int copy=num;
        int count=0;
        while(copy>0){
            copy=copy/10;
            count++;
        }
        r=r%count;
        if(r < 0){
            r = r+count;
        }

        int mul=1;
        int div=1;
        for(int i=1;i <= count;i++){
            if(i<=r){
                div=div*10;
            }else{
                mul =mul*10;
            }

        }
        int q =num/div;
        int rem = num%div;
        rem = rem*mul+q;
        System.out.println(rem);
        sc.close();

    }
    
}

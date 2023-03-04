import java.util.Arrays;
import java.util.Scanner;

public class Minarr {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter size of array");
            int size = in.nextInt();
            int arr[]= new int[size];
            for(int i=0; i< size;i++){
                System.out.println("enter the elements of array");
                int x=in.nextInt();
                arr[i]=x;
            }
            System.out.println(Arrays.toString(arr));
            int x=min(arr);
            System.out.println("Minimum element is "+x);
        }
    }
    static int min(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(ans>arr[i]){
                 ans= arr[i];
            }
        }
        return ans;
    }
    
}

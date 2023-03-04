import java.util.Arrays;

public class RotateArraybyOne {
    static void rotate(int a[]){
        int l = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=l;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,7,5,9};
        
        rotate(arr);
        System.out.println(Arrays.toString(arr));

    }
}

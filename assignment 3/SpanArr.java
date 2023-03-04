public class SpanArr {
    static int max(int arr[],int n){
        int m= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    static int min(int arr[],int n){
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={10,3,11,9,1,25,8};
        int n = arr.length;
        int max = max(arr, n);
        int min = min(arr, n);
        int span = max-min;
        System.out.println(span);

    }
}

public class stocks {
    public static void main(String[] args) {
        int[] arr={7,2,3,8,1,4};
        // if(arr==null||arr.length<=1)
        // return 0;
 
        int min=arr[0]; // min so far
        int result=0;
    
        for(int i=1; i<arr.length; i++){
            result = Math.max(result, arr[i]-min);
            min = Math.min(min, arr[i]);
        }
        System.out.println(result);
    }
}

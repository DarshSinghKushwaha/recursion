public class barchart {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,0,7};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println(max);
        for (int i = max; i > 0; i--) {
                for (int j = 0; j < arr.length; j++) {  
                    if (arr[j] >= i)
                System.out.print('*');
                
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

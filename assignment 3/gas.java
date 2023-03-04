public class gas {
    public static void main(String[] args) {
        int[] gas = {5,1,2,3,4}, cost = {4,4,1,5,1};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int first;
        for(int i=0;i<gas.length;i++){
            if (gas[i]>cost[i]) {
                first=i;
                System.out.println(first);
                int j = i,res=0;
                do{
                    System.out.println(res+" "+gas[j]+" "+cost[j]);
                    res+=gas[j]-cost[j];
                    if(res<=0)
                    break;
                    j=(1+j)%gas.length;
                }while(j != i);
                return(j);
            }
        }
        return -1;
    }
}

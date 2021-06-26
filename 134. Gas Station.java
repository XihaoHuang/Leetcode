class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length,tank=0;
        for(int i=0;i<n;i++){
            tank=0;
            for(int j=0;j<n;j++){
                tank+=gas[(j+i)%n]-cost[(i+j)%n];
                if(tank<0)
                    break;
            }
            if(tank>=0)
                return i;
        }
        return -1;
    }
}
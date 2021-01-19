class Solution {
    int [] sum;
    public Solution(int[] w) {
        for(int i=1;i<w.length;i++)
            w[i]+=w[i-1];
        this.sum=w;
    }
    
    public int pickIndex() {
        int start=0,end=sum.length-1;
        Random ran=new Random();
        int n=ran.nextInt(sum[sum.length-1])+1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(n==sum[mid])
                return mid;
            else if(n<sum[mid])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
class Solution {
    public int[] constructArray(int n, int k) {
        int left=1;
        int right=n;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(k%2==0) ? left++ :right--;
            if(k>1){
                k--;
            }
        }
        return arr;
    }
}
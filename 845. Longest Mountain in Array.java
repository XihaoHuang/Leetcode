class Solution {
    public int longestMountain(int[] arr) {
        int high=0;
        int left=1;
        int right=0;
        int longest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                if(left>1 && right>0)
                    longest=Math.max(longest,left+right);
                left=1;
                right=0;
                high=0;
            }
            if(arr[i]>arr[i-1]){
                if((arr[i-1]<high && arr[i]>=high) || arr[i]<=high){
                    if(left>1 && right>0)
                        longest=Math.max(longest,left+right);
                    left=1;
                    right=0;
                    high=arr[i];
                }
                left++;
                high=arr[i];
            }
            if(arr[i]<arr[i-1] && high>0 && left>1){
                right++;
            }
            if(left>1 && right>0)
                        longest=Math.max(longest,left+right);
            System.out.println(left+" "+right);
            
        }
        return longest<3 ? 0 : longest;
    }
}
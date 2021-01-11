class Solution {
    public int hIndex(int[] citations) {
        int start=0,end=citations.length-1;
        int length=citations.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(length-mid==citations[mid])
                return length-mid;
            else if(length-mid>citations[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return length-start;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] sorted=new int[n1+n2];
        System.arraycopy(nums1,0,sorted,0,n1);
        System.arraycopy(nums2,0,sorted,n1,n2);
        Arrays.sort(sorted);
        if(sorted.length%2==0){
            return (double)(sorted[sorted.length/2]+sorted[sorted.length/2-1])/2;
        }
        else{
            return sorted[sorted.length/2];
        }
        }
    
}
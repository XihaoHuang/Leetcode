class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet();
        Set<Integer> s=new HashSet();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                s.add(i);
            }
        }
        int[] arr=new int[s.size()];
        int l=0;
        for(Integer i:s){
            arr[l++]=i;
        }
        return arr;
    }
}
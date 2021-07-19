class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i:nums2){
            while(!s.isEmpty() && s.peek()<i)
                map.put(s.pop(),i);
            s.push(i);
        }
        for(int i=0;i<m;i++)
            nums1[i]=map.getOrDefault(nums1[i],-1);
        return nums1;
    }
}
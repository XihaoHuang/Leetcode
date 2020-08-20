class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        String s="";
            int n=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(n!=nums[i]){
                s+=n+"->"+nums[i];
            }else{
                s+=n;
            }
            list.add(s);
        }
        return list;
    }
}
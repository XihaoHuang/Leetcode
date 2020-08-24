class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int n:nums)
            set.add(n);
        int n=1;
        while(n<=nums.length){
            if(!set.contains(n))
                list.add(n);
            n++;
        }
        return list;
    }
}
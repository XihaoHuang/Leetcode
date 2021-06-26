class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> arr=new ArrayList<>();
        int index=0,size=0;
        
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
            list.add(arr);
            arr=new ArrayList<>(n);
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && list.get(j).size()+1>list.get(i).size()){
                    list.set(i,new ArrayList<>(list.get(j)));
                    list.get(i).add(nums[i]);
                    if(list.get(i).size()>size){
                        size=list.get(i).size();
                        index=i;
                    }
                }
            // System.out.println(list.get(i));
            }
        }
        return list.get(index);
    }
}
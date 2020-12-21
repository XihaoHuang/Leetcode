class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap();
        List<Integer> arr=new ArrayList<>();
        for(int key:nums1){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
                arr.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] a=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();
		for(String s1:strs) {
			String sorted=sort(s1);
			if(map.containsKey(sorted)) {
				map.get(sorted).add(s1);
			}else {
				map.put(sorted,new ArrayList<String>());
				map.get(sorted).add(s1);
			}
		}
		List<List<String>> list=new ArrayList<>();
		for(List<String> v:map.values()) {
			list.add(v);
		}
        return list;
	}
	public static String sort(String s) {
		char c[]=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
		
	}
}
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        	List<List<Integer>> list=new ArrayList<>();
		combine(list,new ArrayList<Integer>(),1,n,k);
		return list;
	}

	private static void combine( List<List<Integer>> list, ArrayList<Integer> al,int start,int n, int k) {
		if(al.size()==k) {
			list.add(new ArrayList<Integer>(al));
		}else {
		for(int i=start;i<=n;i++) {
			al.add(i);
			combine(list,al,i+1,n,k);
			al.remove(al.size()-1);
			}
		}
	}
    
    
}
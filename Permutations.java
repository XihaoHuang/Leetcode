class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
		backtrack(list,new ArrayList<Integer>(),nums);
 		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> al, int[] a) {
		
		if(al.size()==a.length) list.add(new ArrayList<>(al));
		else {
			for(int i=0;i<a.length;i++) {
				if(al.contains(a[i])) continue;
				al.add(a[i]);	
				backtrack(list,al,a);
				al.remove(al.size()-1);
			}
		}
	}
   }

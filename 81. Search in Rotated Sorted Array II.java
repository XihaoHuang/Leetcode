class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==0) return false;
        return search(0,nums,nums.length-1,target);
	}

	private static boolean search(int start,int[] n, int end, int target) {
		int mid=(start+end)/2;
		if(n[start]==target || n[mid]== target || n[end]== target) return true;
		if(start==mid) return false;
		boolean res=search(start,n,mid,target) || search(mid,n,end,target); 
		return res;
	}
}
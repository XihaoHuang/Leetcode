class Solution {
    public int totalNQueens(int n) {
      		int[] q=new int[n];
		int r=0;
		int a=0;	
		while(q[0]<n) {
			while(q[r]==n || !check(q,r)) {
				q[r]++;
				while(q[r]>=n) {
					if(q[0]==n) return a;
					q[r]=0;
					r--;
					q[r]++;
				}
			}
			r++;
			if(r==n) {
				a++;

				r--;
				q[r]++;
			}
		}
		return a;
	}

	private static boolean check(int[]q,int r) {
		for(int i=0;i<r;i++) {
			if(q[r]==q[i]) return false;
			if(Math.abs(q[r]-q[i])==r-i) return false;
		}
		return true;
	}
	
}
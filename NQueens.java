class Solution {
    public List<List<String>> solveNQueens(int n) {
      		List<List<String>> list=new ArrayList<>();
		int[] q=new int[n];
		int r=0;
		while(q[0]<n) {
			while(q[r]==n || !check(q,r)) {
				q[r]++;
				while(q[r]>=n) {
					if(q[0]==n) return list;
					q[r]=0;
					r--;
					q[r]++;
				}
			}
			r++;
			if(r==n) {
				List<String> l1 =new ArrayList<>();; 
				for(int i=0;i<q.length;i++) {
					StringBuilder sb=new StringBuilder();
					for(int j=0;j<q.length;j++) {
						if(j==q[i]) sb.append("Q");
						else sb.append(".");
					}
					l1.add(sb.toString());
				}
				list.add(l1);
				r--;
				q[r]++;
			}
		}
        return list;
	}
    private static boolean check(int[]q,int r) {
		for(int i=0;i<r;i++) {
			if(q[r]==q[i]) return false;
			if(Math.abs(q[r]-q[i])==r-i) return false;
		}
		return true;
	}
}
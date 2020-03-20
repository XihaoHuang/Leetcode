class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int i=0;
    	int start=0;
    	int end=matrix[0].length;
    	while(i<matrix.length) {
    		while(start<matrix[0].length) {
    			
    			if(matrix[i][start]>target) return false;
    			else if(matrix[i][end-1]<target) break;
    			else {
    				int mid=(start+end)/2;
    				if(matrix[i][mid]==target) return true;
    				else if(matrix[i][mid]<target)
    					start=mid;
    				else 
    					end=mid;
    			if(start==end) break;
    			}
    		}
    		i++;
    	}
		return false;
    	
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
       int max=0;
		for(int i=0;iheights.length;i++) {
			max=(maxchechlargest(i,heights)) chechlargest(i,heights) max;
		}
		return max;
	}
	private static int chechlargest(int i, int[] h) {
		int right=i;
		int left=i;
		while(righth.length && h[right]=h[i])
			right++;
		while(left=0 && h[left]=h[i])
			left--;
		int largestArea=(right-left-1)h[i];

		return largestArea;
	}
}
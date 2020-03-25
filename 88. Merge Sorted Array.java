class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = 1;
		n--;
		m--;			
		while (m>=0 &&n>=0) {
			if (nums1[m] > nums2[n]) {
				nums1[nums1.length - i] = nums1[m--];
			} else {
				nums1[nums1.length - i] = nums2[n--];
			}
			i++;
		}
        
        while(n>=0){
            nums1[nums1.length-i]=nums2[n--];
            i++;
        }
    }
}
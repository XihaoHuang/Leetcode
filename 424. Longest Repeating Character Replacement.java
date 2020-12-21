class Solution {
    public int characterReplacement(String s, int k) {
        int len=s.length();
        int maxlength=0;
        int maxcount=0;
        int[] count=new int[26];
        int start=0;
        for(int end=0;end<len;end++){
            count[s.charAt(end)-'A']++;
            maxcount=Math.max(maxcount,count[s.charAt(end)-'A']);
            while(end-start+1-maxcount>k){
                count[s.charAt(start)-'A']--;
                start++;
            }
            maxlength=Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }
}
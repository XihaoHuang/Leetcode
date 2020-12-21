class Solution {
    public void reverseString(char[] s) {
        System.out.print(s.length);
        for(int i=0;i<(s.length+1)/2;i++){
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
}
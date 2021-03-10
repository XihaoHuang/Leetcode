class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
                sb.append(s.charAt(i));
             if(s.charAt(i)>=48 && s.charAt(i)<=57)
                sb.append(s.charAt(i));
        }
        s=sb.toString();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
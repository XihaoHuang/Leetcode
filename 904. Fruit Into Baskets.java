class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=0;
        for(int i=0;i<typed.length();i++){
            if(n<name.length() && typed.charAt(i)==name.charAt(n)){
                n++;
            }else
                if(i==0 || typed.charAt(i)!=typed.charAt(i-1)){
                return false;
            }
        }
        return n==name.length();
    }
}
class Solution {
    public String freqAlphabets(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();){
            if(i<n-2 && s.charAt(i+2)=='#'){
                int v=96+Integer.parseInt(s.substring(i,i+2));
                sb.append((char)v);
                i+=3;
                continue;
            }    
            sb.append((char)(97+s.charAt(i)-'1'));
            i++;
        }
        return sb.toString();
    }
}
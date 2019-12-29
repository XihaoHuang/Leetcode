class Solution {
    public String convert(String s, int numRows) {
  	StringBuilder val=new StringBuilder();
        if(numRows==1) return s;
    	int n=numRows;
    	for(int i=0;in;i++) {
    		for(int j=0;i+js.length();j+=(2n-2)) {
    			val.append(s.charAt(i+j));
                if(i0 &&in-1 &&j+2n-2-is.length()) {
    				val.append(s.charAt(j+2n-2-i));
    			}
    	
    		}
    		
    	}
    	return val.toString();
    }
}
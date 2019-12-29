class Solution {
    public int myAtoi(String s) {
        s=s.trim();
		if(s.isEmpty()) return 0;
		int sign=1,i=0;
		long ans=0;
		char[] c=s.toCharArray();
		if(c[0]==45) {
			sign=-1;
			i=1;
		}else if(c[0]==43) {
			sign=1;
            i=1;
		}else if(!Character.isDigit(c[0])) {
			return 0;
		}
		while(i<c.length) {
			if(!Character.isDigit(c[i])) break;
			ans=ans*10+Character.getNumericValue(c[i++]);
			if(ans>Integer.MAX_VALUE) {
				if(sign==1) {
				return Integer.MAX_VALUE;
				}else
					return Integer.MIN_VALUE;
				}		
			}
		
	
	return (int)ans*sign;
}
}
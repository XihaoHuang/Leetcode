class Solution {
    public String addBinary(String a, String b) {
       int start=1;
		int al=a.length();
		int bl=b.length();
		int carry=0;
		String ans="";
		while(start<=al && start<=bl) {
			if(a.charAt(al-start)==b.charAt(bl-start) && a.charAt(al-start)=='1'){
				if(carry==0) {					
					ans=0+ans;
					carry++;
				}
				else {
					ans=1+ans;
				}
			}
			else if(a.charAt(al-start)==b.charAt(bl-start) && a.charAt(al-start)=='0') {
					if(carry==0)
						ans=0+ans;
					else {
						ans=1+ans;
						carry--;
					}
						
				
			}else if(a.charAt(al-start)!=b.charAt(bl-start)) {
				if(carry==0)
					ans=1+ans;
				else {
					ans=0+ans;
				}
			}
			start++;
		}
		String c=(start>a.length()) ? b : a;
		for(int i=start;i<=c.length();i++) {
			if(carry==0) 
				ans=c.charAt(c.length()-i)+ans;
			else {
				if(c.charAt(c.length()-i)=='1') {
					ans=0+ans;
					}
				else {
					ans=carry+ans;
					carry--;
				}
				}
		}
		if(carry==1)
			ans=carry+ans;
		return ans;
	}
}
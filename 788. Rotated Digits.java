class Solution {
    
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(rotate(i))
                count++;
        }
        return count;
    }
    public boolean rotate(int i){
        boolean valid=false;
        while(i>0){
            if(i%10==2 || i%10==5 || i%10==6 || i%10==9)
                valid=true;
            if(i%10==4 || i%10==7 || i%10==3)
                return false;
            i/=10;
        }
        return valid;
    }
}
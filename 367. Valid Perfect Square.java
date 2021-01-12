class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1,right=num;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid>(double)num/mid)
                right=mid-1;
            else if(mid==(double)num/mid)
                return true;
            else
                left=mid+1;
        }
        return false;
    }
}
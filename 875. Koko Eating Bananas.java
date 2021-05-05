class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int pile:piles)
            max=max>pile? max:pile;
        int l=1,r=max;
        while(l<r){
            int mid=l+(r-l)/2,total=0;
            for(int pile:piles){
                total+= pile<=mid? 1:pile/mid;
                total+= pile>mid && pile%mid!=0 ? 1:0;
            }
            if(total>h)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
}
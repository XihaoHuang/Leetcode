class Solution {
    public int kthSmallest(int[][] m, int k) {
        int l=m[0][0],h=m[m.length-1][m[0].length-1];
        while(l<h){
            int mid=l+(h-l)/2,count=0;
            for(int[] r:m)
                for(int c: r)
                    if(c<=mid)
                        count++;
            if(count>=k)
                h=mid;
            else
                l=mid+1;
          //  System.out.println(count+" "+mid+" "+l+" "+h);
        }
        return l;
    }
}
class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=0;
        int left=-1;
        int i=0;
        while(i<=seats.length){
            if(i==seats.length){
                max=Math.max(max,i-left-1);
            }
            else if(seats[i]==1){
                if(left==-1){
                    max=i-left-1;
                }else{
                max=Math.max(max,(i-left)/2);
                }
                left=i;
            }
            i++;
        }
        return max;
    }
}
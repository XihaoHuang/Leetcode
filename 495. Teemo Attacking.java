class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0) return 0;
        int time=0;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-timeSeries[i-1]<duration)
                time+=timeSeries[i]-timeSeries[i-1];
            else
                time+=duration;
        }
        return time+duration;
    }
}
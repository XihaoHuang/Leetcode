class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        int i;
        for(i=0;i<intervals.length;i++){
            if(newInterval[0]>intervals[i][1]){
                list.add(intervals[i]);
            }else if(newInterval[1]<intervals[i][0]) {
                break;
            }else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        list.add(newInterval);
        while(i<intervals.length)
            list.add(intervals[i++]);
        int[][] ans=new int[list.size()][2];
        for(i=0;i<list.size();i++)
            ans[i]=list.get(i);
        return ans;
    }
}
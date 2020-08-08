class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int time=0;
        for(int i=0;i<prices.length;i++){
            time=Math.max(time,prices[i]-buy);
            buy=Math.min(buy,prices[i]);
        }
        return time;
    }
}
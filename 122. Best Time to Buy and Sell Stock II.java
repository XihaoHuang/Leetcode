class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,i=0;
        while(i<prices.length){
            while(i<prices.length-1 && prices[i]>=prices[i+1])
                i++;
            int min=prices[i++];
            while(i<prices.length-1 && prices[i]<=prices[i+1])
                i++;
            profit+= i<prices.length ? prices[i++]-min:0;
        }
        return profit;
    }
}
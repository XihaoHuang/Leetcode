class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean left,right;
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            right=false;
            left=false;
            if(i==0) left=true;
            if(i==flowerbed.length-1) right=true;
            if(flowerbed[i]==0){
                left=left || flowerbed[i-1]==0;
                right=right || flowerbed[i+1]==0;
                if(left && right){
                count++;
                flowerbed[i]=1;
                } 
               
            }
        }
        return count>=n;
    }
}
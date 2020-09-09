class Solution {
    public boolean isIdealPermutation(int[] A) {
        int local=0;
        int global=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+2;j<A.length;j++){
                if(A[i]>A[j]) return false;
            }
        }
        return true;
    }
}
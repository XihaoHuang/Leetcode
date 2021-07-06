class Solution {
    int count;
    public int countArrangement(int n) {
        count=0;
        backtrack(n,1,new boolean[n+1]);
        return count;
    }
    public void backtrack(int n,int val, boolean[] visited){
        if(val>n){
            count++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i] && (val%i==0 || i%val==0)){
                visited[i]=true;
                backtrack(n,val+1,visited);
                visited[i]=false;
            } 
        }
    }
}
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
          int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a=0;a<A.length;a++){
            for(int b=0;b<B.length;b++){
                if(hm.containsKey(0-A[a]-B[b]))
                    hm.put(0-A[a]-B[b],hm.get(0-A[a]-B[b])+1);
                else
                hm.put(0-A[a]-B[b],1);
            }
        }

        for(int c=0;c<C.length;c++){
            for(int d=0;d<D.length;d++){
                if(hm.containsKey(C[c]+D[d]))
                    count+=hm.get(C[c]+D[d]);
                }
            }
         
        return count;
    }
}
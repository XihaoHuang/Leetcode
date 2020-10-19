class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int length=0;
        Set<Integer> set=new HashSet<>();
        for(int a:A){
            set.add(a);
        }
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                int a=A[i];
                int b=A[j];
                int c=a+b;
                int count=2;
                while(set.contains(c)){
                    count++;
                    length=(length>count)? length:count;
                    a=b;
                    b=c;
                    System.out.print(c+" ");
                    c=a+b;
                }
            }
        }
        return length;
    }
}
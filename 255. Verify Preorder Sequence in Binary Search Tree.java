class Solution {
    public boolean verifyPreorder(int[] preorder) {
        int min=Integer.MIN_VALUE;
        Stack<Integer> s=new Stack<>();
        for(int p:preorder){
            if(p<min)
                return false;
            while(!s.isEmpty() && s.peek()<p)
                min=s.pop();
            s.push(p);
        }
        return true;
    }
}
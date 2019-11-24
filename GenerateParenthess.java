class Solution {
   public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0) return res;
        
        dfs(res, new StringBuffer(), n, 0, 0);
        return res;
    }
    private void dfs(List<String> res, StringBuffer sf, int n, int left, int right){
        // success return
        if(left == n && right == n && left == right){
            res.add(String.valueOf(sf));
            return;
        }
        // fail return
        if(left > n || left < right){
            return;
        }
        // dfs
        dfs(res, sf.append("("), n, left + 1, right);
        sf.deleteCharAt(sf.length() - 1);
        dfs(res, sf.append(")"), n, left, right + 1);
        sf.deleteCharAt(sf.length() - 1);
    }
}
class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        for(String dir: path.split("/")){
            if(dir.equals("..")){
               if(!s.isEmpty()){
                s.pop();
               }
           }else if(!dir.equals(".") && dir.length()>0){
                s.push(dir);
            }
        }
        String res="";
        for(String ans:s){
            res=res+"/"+ans;
        }
        return res.isEmpty()? "/":res;
    }
}
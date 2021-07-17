/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Map<Integer,Node> map=new HashMap<>();
        map.put(p.val,p);
        map.put(q.val,q);
        while(p.parent!=null){
            p=p.parent;
            if(map.containsKey(p.val))
                return p;
            map.put(p.val,p);
        }
        while(q.parent!=null){
            q=q.parent;
            if(map.containsKey(q.val))
                return q;
        }
        return null;
    }
}
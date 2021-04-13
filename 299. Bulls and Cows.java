class Solution {
    
    public String getHint(String secret, String guess) {
        HashMap<Integer,Character> b=new HashMap<>();
        HashMap<Character,Integer> c=new HashMap<>();
        for(int i=0;i<secret.length();i++){
            b.put(i,secret.charAt(i));
            c.put(secret.charAt(i),c.getOrDefault(secret.charAt(i),0)+1);    
        }
        int s=0;
        int g=0;
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==b.get(i))
                s++;
            if(c.containsKey(guess.charAt(i))){
                g++;
                c.put(guess.charAt(i),c.get(guess.charAt(i))-1);
                if(c.get(guess.charAt(i))==0)
                    c.remove(guess.charAt(i));
            }
        }
        return s+"A"+(g-s)+"B";
    }
}
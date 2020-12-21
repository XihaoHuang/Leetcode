class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] c=s.toCharArray();
        int front=0;
        int back=c.length-1;
        while(front<back){
            if(!set.contains(c[front])){
                front++;
            }
            if(!set.contains(c[back])){
                back--;
            }
            if(set.contains(c[front])&&set.contains(c[back])){
                char temp=c[front];
                c[front]=c[back];
                c[back]=temp;
                front++;
                back--;
            }
        }
        return new String(c);
    }
}
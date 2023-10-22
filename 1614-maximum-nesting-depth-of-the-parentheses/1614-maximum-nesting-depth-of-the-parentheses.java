class Solution {
    public int maxDepth(String s) {
        int max=0;
        Stack<Character>st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')st.push(c);
            else if(c==')')st.pop();
            max=Math.max(max,st.size());
        }
        return max;
    }
}
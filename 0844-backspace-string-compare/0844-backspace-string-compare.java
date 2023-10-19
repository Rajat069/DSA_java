class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character>st = new Stack<>();
         for(char c:s.toCharArray()){
            if(c=='#'){
                if(!st.isEmpty()){
                   st.pop();
                }
            }
            else{
                st.push(c);
            }
         }
         StringBuilder sb = new StringBuilder();
         while(!st.isEmpty()){
             sb.append(st.pop());
         }
         Stack<Character>st1 = new Stack<>();
         for(char c:t.toCharArray()){
            if(c=='#'){
                if(!st1.isEmpty()){
                   st1.pop();   
                }
            }
            else{
                st1.push(c);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while(!st1.isEmpty()){
             sb1.append(st1.pop());
        }
        return sb.toString().equals(sb1.toString());
    }
}
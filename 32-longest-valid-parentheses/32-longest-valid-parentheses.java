class Solution {
    public int longestValidParentheses(String S) {
         Stack<Integer> st = new Stack<>();
        int num =0;
        st.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                 st.push(i);
                }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int m = i-st.peek();
                    num= Math.max(m,num);
                }
            }
        }
        return num;
    }
}
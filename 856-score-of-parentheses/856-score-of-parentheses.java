class Solution {
    public int scoreOfParentheses(String s) {
          Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else {
                if(!st.isEmpty()&&st.peek()=='('){
                    st.pop();
                    st.push('1');
                }
                else{
                    int num = 0;
                    while(!st.isEmpty()&&st.peek()!='('){
                        num+=(st.pop()-'0');
                    }
                    st.pop();
                    st.push((char)(num*2+'0'));
                }
            }
        }
            int sum =0;
            while(!st.isEmpty()){
                sum+=(st.peek()-'0');
                st.pop();
            }
        return sum;
        }
        
    }
class Solution {
    public int countCollisions(String directions) {
        int col=0;
        Stack<Character>st = new Stack<>();
        for(char c:directions.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()!=c){
                if(st.peek()=='R'&&c=='L'){
                    col+=2;
                    st.pop();
                    while(!st.isEmpty()&&st.peek()=='R'){
                        col++;
                        st.pop();
                    }
                    st.push('S');
                 }
                else if(st.peek()=='S'&&c=='L'){
                    col++;
                }
                else if(st.peek()=='R'&&c=='S'){
                    while(!st.isEmpty()&&st.peek()=='R'){
                        col++;
                        st.pop();
                    }
                    st.push(c);
                }
                else st.push(c);
            }
            else st.push(c);
        }
        return col;
    }
}
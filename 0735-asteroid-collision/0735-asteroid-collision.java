class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids){
            if(st.isEmpty()){
                st.push(i);
            }
            else if(st.peek()>0&&i<0){
                while(!st.isEmpty()&&Math.abs(i)>st.peek()&&st.peek()>0){
                    st.pop();
                 }
                if(!st.isEmpty()&&st.peek()==Math.abs(i)){
                    st.pop();
                }
                else if(st.isEmpty()||!st.isEmpty()&&st.peek()<0)st.push(i);
            }
            else st.push(i);
        }
        int[] ans = new int[st.size()];
        int idx=ans.length-1;
        while(idx>=0){
            ans[idx--]=st.pop();
        }
        return ans;
    }
}
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minCos=0,idx=0;
        Stack<Pair<Character,Integer>>st = new Stack<>();
        while(idx<colors.length()){
            char ch = colors.charAt(idx);
            if(st.isEmpty()){
                st.push(new Pair<>(ch,neededTime[idx]));
            }
            else{
                if(st.peek().getKey()==ch){
                   if(st.peek().getValue()<neededTime[idx]){
                       minCos+=st.pop().getValue();
                       st.push(new Pair<>(ch,neededTime[idx]));
                   }
                   else minCos+=neededTime[idx];
                }
                else st.push(new Pair<>(ch,neededTime[idx]));
            }
            idx++;
        }
        return minCos;
    }
}
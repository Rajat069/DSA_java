class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<Integer> st = new Stack<Integer>();
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        for(int i=0;i<intervals.length;i++){
            if(st.isEmpty()){
                st.push(intervals[i][0]);
                st.push(intervals[i][1]);
            }else{
                if(intervals[i][0]<=st.peek()){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    if(intervals[i][0]<num2){
                        st.push(intervals[i][0]);
                        st.push(num1);
                    }
                    else{
                        st.push(num2);
                        st.push(num1);
                    }
                    if(intervals[i][1]>st.peek()){
                    st.pop();
                    st.push(intervals[i][1]);
                    }
                }
                else{
                     st.push(intervals[i][0]);
                     st.push(intervals[i][1]);
                }
            }
        }
        int[][] ans = new int[st.size()/2][2];
        for(int j=st.size()/2-1;j>-1;j--){
            for(int i=1;i>-1;i--){
                ans[j][i]=st.pop();
            }
        }
        return ans;
    }
}
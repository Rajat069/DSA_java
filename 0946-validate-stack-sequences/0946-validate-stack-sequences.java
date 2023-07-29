class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> isValid = new Stack<>();
        int p2=0;
        for(int i=0;i<pushed.length;i++){
            isValid.push(pushed[i]);
            while(!isValid.isEmpty()&&isValid.peek()==popped[p2]){
                 isValid.pop();
                 p2++;
            }
        }
        while(!isValid.isEmpty()&&isValid.peek()==popped[p2]){
                 isValid.pop();
                 p2++;
        }
        return isValid.size()==0;
    }
}
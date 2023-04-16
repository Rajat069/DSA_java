class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int cur=0;
        char op='+';
        HashSet<Character> hs = new HashSet<>(Arrays.asList('+','*','-','/'));
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                cur=cur*10+s.charAt(i)-'0';
            }
            if(hs.contains(s.charAt(i))||i==s.length()-1){
                if(op=='+'){
                    st.push(cur);
                }
                else if(op=='-'){
                    st.push(-cur);
                }
                else if(op=='*'){
                    st.push(st.pop()*cur);
                }
                else{
                    st.push(st.pop()/cur);
                }
                op=s.charAt(i);
                cur=0;
            }   
         }
      int sol=0;
      while(!st.isEmpty()){
            sol+=st.pop();
      }
      return sol; 
    }
    
  }
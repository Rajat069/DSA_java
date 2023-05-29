class Solution {
    public String simplifyPath(String path) {
         Stack<String> st = new Stack<>();
         for(int i=0;i<path.length();i++){
             if(path.charAt(i)=='/')continue;
             StringBuilder sb = new StringBuilder();
             while(i<path.length()&&path.charAt(i)!='/'){
                 sb.append(path.charAt(i));
                 i++;
             }
             i--;
             if(sb.toString().equals("."))continue;
             if(sb.toString().equals("..")){
                 if(!st.isEmpty())st.pop();
             }
             else st.push(sb.toString());
         }
        StringBuilder sol = new StringBuilder("/");
        for(String s:st){
            sol.append(s+"/");
        }
        
        return sol.length()!=1?sol.deleteCharAt(sol.length()-1).toString():sol.toString();
    }
}
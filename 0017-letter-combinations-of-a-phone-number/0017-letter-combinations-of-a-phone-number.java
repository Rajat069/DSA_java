class Solution {
    List<String> sol = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        helper(digits,new StringBuilder(),0);
        return sol;
    }
    String[] mp = new String[]{
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    private void helper(String dig,StringBuilder sb,int idx){
        if(idx==dig.length()){
            if(sb.length()!=0)sol.add(sb.toString());
            return;
        }
        int d=dig.charAt(idx)-'0';
        String mapping = mp[d-1];
        for(int i=0;i<mapping.length();i++){
            sb.append(mapping.charAt(i));
            helper(dig,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
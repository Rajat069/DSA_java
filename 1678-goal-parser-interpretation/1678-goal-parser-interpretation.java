class Solution {
    public String interpret(String com) {
        String ans ="";
        for(int i=0;i<com.length();i++){
                if(com.charAt(i)=='('){
                if(com.charAt(i+1)==')'){
                    ans+='o';
                    i+=1;
                }
                else {
                    ans+="al";
                    i+=3;
                    }
                }
            else  ans+=com.charAt(i);
          
          }
          return ans;
    }
}
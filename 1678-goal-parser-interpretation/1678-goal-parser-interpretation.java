class Solution {
    public String interpret(String com) {
        String ans ="";
        for(int i=0;i<com.length();i++){
            if(com.charAt(i)=='G'){
                ans+=com.charAt(i);
            }
            else if(com.charAt(i)=='('){
                if(com.charAt(i+1)==')'){
                    ans+='o';
                    i+=1;
                }
                else if((com.substring(i+1,i+4)).equals("al)")){
                    ans+="al";
                    i+=3;
                    }
            }
          
        }
          return ans;
    }
}
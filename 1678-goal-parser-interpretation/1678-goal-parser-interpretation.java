class Solution {
    public String interpret(String com) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<com.length();i++){
                if(com.charAt(i)=='('){
                if(com.charAt(i+1)==')'){
                    sb.append('o');
                    i+=1;
                }
                else {
                    sb.append("al");
                    i+=3;
                    }
                }
            else  sb.append("G");
          
          }
          return sb.toString();
    }
}
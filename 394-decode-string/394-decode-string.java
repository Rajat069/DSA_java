class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int i=0;
        String temp = "";
        while(i<s.length()){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int count = i;
                while(Character.isDigit(s.charAt(i))){
                    i++;
                }
                num.push(Integer.valueOf(s.substring(count,i)));
            }
            else if(ch==']'){
                int count=num.pop();
                StringBuilder sb = new StringBuilder(str.pop());
                while(count-->0){
                    sb.append(temp);
                }
                temp=sb.toString();
                i++;
            }
            else if(ch=='['){
                str.push(temp);
                temp="";
                i++;
            }
            else {
                temp+=ch;
                i++;
            }
        }
        return temp;
    }
}
class Solution {
    public int calculate(String s) {
        Stack<Integer>brackets = new Stack<>();
        int sign=1,sol=0;
        for(int i=0;i<s.length();i++){
            int curnum=0;
            boolean flag=false;
            while(i<s.length()&&Character.isDigit(s.charAt(i))){
                curnum=curnum*10+s.charAt(i)-'0';
                i++;
                flag=true;
            }
            sol+=curnum*sign;
            if(flag)i--;
            if(s.charAt(i)=='('){
                brackets.push(sol);
                brackets.push(sign);
                sol=0;
                sign=1;
            }
            else if(s.charAt(i)==')'){
                sol*=brackets.pop();
                sol+=brackets.pop();
            }
            else if(s.charAt(i)=='+')sign=1;
            else if(s.charAt(i)=='-')sign=-1;
        }
        return sol;
    }
}
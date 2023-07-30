class Solution {
    public boolean isNumber(String s) {
        int signC=0,dot=0,e=0,num=0;
        int eLoc=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='+'||c=='-'){
               signC++;
               if(signC>1&&Character.toUpperCase(s.charAt(i-1))!='E'||i!=0&&Character.toUpperCase(s.charAt(i-1))!='E'||i==s.length()-1)return false; 
            }
            else if(c=='e'||c=='E'){
                if(i==s.length()-1||i<s.length()-2&&!Character.isDigit(s.charAt(i+2)))return false;
                e++;
                eLoc=i;
                if(e>1||i==s.length()-1||i==0||num==0||i!=0&&s.charAt(i-1)=='-')return false;
            }
            else if(c=='.'){
                dot++;
                if(dot>1||eLoc<i||s.length()==1)return false;
            }
            else if(Character.isAlphabetic(c)&&Character.toUpperCase(c)!='E')return false;
            else if(Character.isDigit(c))num++;
        }
        if(signC>0&&e==0&&s.charAt(0)!='-'&&s.charAt(0)!='+'||signC>0&&num==0)return false; 
        return true;
    }
}
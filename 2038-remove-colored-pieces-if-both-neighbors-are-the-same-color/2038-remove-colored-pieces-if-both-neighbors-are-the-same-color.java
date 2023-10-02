class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0,b=0;
        for(int i=0;i<colors.length();i++){
            char c=colors.charAt(i);
            int len=0;
            while(i<colors.length()&&c==colors.charAt(i)){
                i++;
                len++;
            }
            i--;
            if(c=='A'){
                a+=(len>2?len-2:0);
            }
            else b+=(len>2?len-2:0);
        }
        return a>b;
    }
}
class Solution {
    public int numDecodings(String s) {
        int[]ways= new int[s.length()];
        if(s.charAt(0)-'0'!=0)ways[0]=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'&&s.charAt(i-1)=='0'){
                ways[i]=0;
            }
            else if(s.charAt(i)=='0'&&s.charAt(i-1)!='0'){
                int num = s.charAt(i-1)-'0';
                if(num<3){
                    ways[i]=i>2?ways[i-2]:1;
                }
            }
            else if(s.charAt(i)!='0'&&s.charAt(i-1)=='0'){
                 ways[i]=ways[i-1];
            }
            else{
                int num = Integer.valueOf(s.substring(i-1,i+1));
                if(num<=26){
                    ways[i]=ways[i-1]+(i>=2?ways[i-2]:1);
                }
                else ways[i]=ways[i-1];
            }
        }
        return ways[s.length()-1];
    }
}
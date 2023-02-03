class Solution {
    public String reverseWords(String s) {
        StringBuilder rev = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            StringBuilder temp = new StringBuilder();
            while(i>=0&&s.charAt(i)==' ')i--;
            while(i>=0&&s.charAt(i)!=' '){
                temp.append(s.charAt(i)+"");
                i--;
            }
            i++;
            temp.reverse();
            rev.append(temp.toString()+" ");
        }
        return rev.toString().trim();
    }
}
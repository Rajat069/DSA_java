import static java.lang.Math.abs;
class Solution {
    public int minFlips(int a, int b, int c) {
        String one = Integer.toBinaryString(a),two=Integer.toBinaryString(b);
        String fstring = Integer.toBinaryString(c);
        int maxlen = (one.length() > two.length())
    ? (one.length() > fstring.length() ? one.length() : fstring.length())
    : (two.length() > fstring.length() ? two.length() : fstring.length());
        one=fillZeroes(one,maxlen-one.length());
        two=fillZeroes(two,maxlen-two.length());
        fstring=fillZeroes(fstring,maxlen-fstring.length());
        int count=0;
        for(int i=0;i<one.length();i++){
            char aa = one.charAt(i), bb = two.charAt(i), cc=  fstring.charAt(i);
            if(((int)aa|(int)bb)==(int)cc){
                continue;
            }
            if(cc=='0'){
                if(aa=='1')count++;
                if(bb=='1')count++;
            }
            else if(aa!='1'&&bb!='1')count++;
            }
           return count;
        }
        
    public String fillZeroes(String s,int count){
        if(count==0)return s;
        StringBuilder sb = new StringBuilder(s);
        return sb.insert(0,"0".repeat(count)).toString();
    }
}
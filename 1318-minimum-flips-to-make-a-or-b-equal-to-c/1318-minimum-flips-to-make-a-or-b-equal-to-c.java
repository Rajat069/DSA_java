import static java.lang.Math.abs;
class Solution {
    public int minFlips(int a, int b, int c) {
        String one = Integer.toBinaryString(a),two=Integer.toBinaryString(b);
        String fstring = Integer.toBinaryString(c);
        int maxlen = (one.length() > two.length())
    ? (one.length() > fstring.length() ? one.length() : fstring.length())
    : (two.length() > fstring.length() ? two.length() : fstring.length()); //getting maximum length
        one=fillZeroes(one,maxlen-one.length()); // here we fill all the zeroes in the begining of the string returned by the toBinaryString() method as it returns string in only required bit so like for 1 "1" for 4 "100"
        two=fillZeroes(two,maxlen-two.length());
        fstring=fillZeroes(fstring,maxlen-fstring.length());
        int count=0;
        for(int i=0;i<one.length();i++){
            char aa = one.charAt(i), bb = two.charAt(i), cc=  fstring.charAt(i);
            if(((int)aa|(int)bb)==(int)cc){//if or is same skip
                continue;
            }
            if(cc=='0'){  //if in final string there is 0 so count no of 1's
                if(aa=='1')count++;
                if(bb=='1')count++;
            }
            else if(aa!='1'&&bb!='1')count++; // if '1' is in final or needs only one '1' bit so increment only when both are '0'
            }
           return count;
        }
        
    public String fillZeroes(String s,int count){ //to fill the strings
        if(count==0)return s;
        StringBuilder sb = new StringBuilder(s);
        return sb.insert(0,"0".repeat(count)).toString();
    }
}
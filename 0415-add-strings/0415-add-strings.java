class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        StringBuilder sb = new StringBuilder();
        int p1=num1.length()-1,p2=num2.length()-1;
        while(p1>=0&&p2>=0){
            int d = num1.charAt(p1--)-'0'+num2.charAt(p2--)-'0'+carry;
            sb.append(d%10);
            carry=d/10;
        }
        while(p1>=0){
            int d = num1.charAt(p1--)-'0'+carry;
            sb.append(d%10);
            carry=d/10;
        }
        while(p2>=0){
            int d = num2.charAt(p2--)-'0'+carry;
            sb.append(d%10);
            carry=d/10;
        }
        if(carry!=0){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
    }
}
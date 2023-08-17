public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String num = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        if(num.length()<32){
            sb.append("0".repeat(32-num.length()));
        }
        num=sb.toString();
        int pow=0;
        int revNum=0,idx=31;
        while(idx>=0){
            if(num.charAt(idx--)=='1')revNum += (1 << pow);
            pow++;
        }
        return revNum;
    }
}

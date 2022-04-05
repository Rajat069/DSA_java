class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        int temp =num;
        StringBuilder sb = new StringBuilder();
        if(num<0)num=num*-1;
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(temp<0){
            String ans = sb.reverse().toString();
            return '-'+ans;
        }
        return sb.reverse().toString();
    }
}
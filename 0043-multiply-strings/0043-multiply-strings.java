class Solution {
    public String multiply(String num1, String num2) {
        int len1=num1.length(),len2=num2.length();
        String smallnum = len1<=len2?num1:num2;
        String bignum = len1>len2?num1:num2;
        String pre="0";
        int p1=bignum.length(),p2=smallnum.length(),zr=0;
        for(int i=p2-1;i>=0;i--){
           int mul = smallnum.charAt(i)-'0';
           if(mul==0){
              zr++; 
              continue;
           }
           StringBuilder temp = new StringBuilder();
           int carry=0; 
           for(int j=p1-1;j>=0;j--){
               int ml = mul*(bignum.charAt(j)-'0');
               ml+=carry;
               temp.append(ml%10);
               carry=ml/10;
           }
           if(carry!=0)temp.append(carry);
           temp.reverse();
           temp.append("0".repeat(zr++));
           pre=addStrings(pre,temp.toString());
        }
        return pre;
    }
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
            i--;
            j--;
        }
        return result.toString();
    }
}
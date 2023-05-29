class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder num1 =new StringBuilder(Integer.toBinaryString(start));
        StringBuilder num2 =new StringBuilder(Integer.toBinaryString(goal));
        int s1=num1.length(),s2=num2.length();
        if(s1>s2){
            num2.insert(0,"0".repeat(s1-s2));
        }else  num1.insert(0,"0".repeat(s2-s1));
        System.out.println(num1+"  "+num2);
        int f=num1.length()-1,l=num2.length()-1;
        int flip=0;
        while(f>=0&&l>=0){
            if(num1.charAt(f)!=num2.charAt(l))flip++;
            f--;
            l--;
        }
        return flip;
    }
}
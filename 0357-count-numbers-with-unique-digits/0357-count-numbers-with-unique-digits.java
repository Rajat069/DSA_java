class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count=0;
        while(n!=0){
            int temp=n,val=9,loc=1;
            while(temp!=0){
                loc*=val;
                if(temp!=n){
                    val--;
                }
                temp--;
            }
            count+=loc;
            n--;
        }
        return count+1;
    }
}
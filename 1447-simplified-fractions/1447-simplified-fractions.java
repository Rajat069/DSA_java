class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans_list = new ArrayList<>();
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(gcd(i,j)==1){
                    String temp = j+"/"+i;
                    ans_list.add(temp);
                }
            }
        }
        return ans_list;
    }
    public int gcd(int a,int b){
        if(a%b==0)return b;
        else if(b%a==0)return a;
        return gcd(a%b,b%a);
    }
}
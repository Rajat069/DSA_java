class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans_list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(gcd(i,j)==1){
                    String temp = i+"/"+j;
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
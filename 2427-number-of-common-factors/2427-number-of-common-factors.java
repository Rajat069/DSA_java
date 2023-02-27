class Solution {
    public int commonFactors(int a, int b) {
        HashSet<Integer> factors_a = new HashSet<>();
        int num1=a;
        a/=2;
        while(a!=0){
            if(num1%a==0)factors_a.add(a);
            a--;
        }
        HashSet<Integer> factors_b= new HashSet<>();
        int num2=b;
        b/=2;
        while(b!=0){
            if(num2%b==0&&factors_a.contains(b))factors_b.add(b);
            b--;
        }
        if(num1%num2==0)factors_b.add(num2);
        else if(num2%num1==0)factors_b.add(num1);
        return factors_b.size();
    }
}
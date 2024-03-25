class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer>ar=getFactors(n);
        if(k>ar.size())return -1;
        return ar.get(k-1);
    }
     public  ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);
                if (i!=number/i) {
                    factors.add(number/i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }
}
class Solution {
    public int countDigitOne(int n) {
        if (n == 0) return 0;
        else if (n <= 9) return 1;
        return helper(n);
    }
    
    private int[] ar = new int[]{1, 20, 300, 4000, 50000, 600000, 7000000, 80000000, 900000000};
    
    private int helper(int num) {
        int cOne = 0;
        String No = String.valueOf(num);
        int pow = No.length() - 1;
        
        for (int i = 0; i < No.length(); i++) {
            int dig = No.charAt(i) - '0';
            
            if (i == No.length() - 1 && dig != 0) {
                cOne++;
            } else {
                num -= (Math.pow(10, pow) * dig);
                if (dig == 1) {
                    cOne += (num + ar[pow - 1] + 1);
                } else if (dig != 0) {
                    cOne += (ar[pow - 1] * dig + Math.pow(10, pow));
                }
            }
            pow--;
        }
        
        return cOne;
    }
}

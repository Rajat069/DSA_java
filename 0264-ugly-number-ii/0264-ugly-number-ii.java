class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(Math.min(uglyNumbers[p1] * 2, uglyNumbers[p2] * 3), uglyNumbers[p3] * 5);
            uglyNumbers[i] = nextUgly;

            if (uglyNumbers[p1] * 2 == nextUgly) {
                p1++;
            }
            if (uglyNumbers[p2] * 3 == nextUgly) {
                p2++;
            }
            if (uglyNumbers[p3] * 5 == nextUgly) {
                p3++;
            }
        }

        return uglyNumbers[n - 1];
    }
}

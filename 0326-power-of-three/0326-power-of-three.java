class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)return false;
       return (int)(Math.ceil((Math.log10(n) / Math.log10(3))))
			== (int)(Math.floor(
				((Math.log10(n) / Math.log10(3)))));
    }
}
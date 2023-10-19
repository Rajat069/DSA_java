class Solution {
    String sol="";
    HashSet<String>hs = new HashSet<>();
    public String findDifferentBinaryString(String[] nums) {
        int len=nums[0].length();
        for(String s:nums){
            hs.add(s);
        }
        generateCombinations("",len);
        return sol;
    }
     private void generateCombinations(String current, int n) {
        if (n == 0) {
             if(!hs.contains(current)){
                 sol=current;
                 return;
             }
        } else {
            generateCombinations(current + "0",n - 1);
            generateCombinations(current + "1",n - 1);
        }
    }
}
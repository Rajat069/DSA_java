class Solution {
    public String largestNumber(int[] nums) {
        String[] numss = new String[nums.length];
        int idx=0;
        for(int i:nums){
            numss[idx++]=String.valueOf(i);
        }
        Arrays.sort(numss, (a, b)->((a+b).compareTo(b+a)));
        StringBuilder sb = new StringBuilder();
        int zr=0;
        for(int i=numss.length-1;i>=0;i--){
            if(numss[i].equals("0"))zr++;
            sb.append(numss[i]);
        }
        return sb.length()==zr?"0":sb.toString();
    }
}
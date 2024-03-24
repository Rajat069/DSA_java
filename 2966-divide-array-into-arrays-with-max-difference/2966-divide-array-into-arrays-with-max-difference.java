class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int g=0;
        int[][]sol=new int[nums.length/3][3];
        for(int i=0;i<nums.length/3;i++){
            int[]ar=new int[3];
            for(int j=0;j<3;j++){
                ar[j]=nums[g++];
                if(j>0&&ar[j]-ar[j-1]>k)return new int[][]{};
            }
            if(ar[2]-ar[0]>k)return new int[][]{};
            sol[i]=ar;
        }
        return sol;
    }
}
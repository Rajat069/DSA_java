class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(dif!=arr[i+1]-arr[i]){
                return false;
            }
        }
        return true;
    }
}
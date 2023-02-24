class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        for(int i:arr){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        if(max==min)return true;
        else{
            int n=arr.length;
            boolean seen[] = new boolean[n];
            int d = (max-min)/(n-1);
            if(d==0)return false;
            for(int i:arr){
                int pos=(i-min)/d;
                if(pos>=n||seen[pos]||pos*d!=(i-min))return false;
                seen[pos]=true;
            }
        }
        return true;
    }
}
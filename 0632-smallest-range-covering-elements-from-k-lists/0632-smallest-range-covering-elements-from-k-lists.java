class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
       int[] pointers = new int[nums.size()];
       int max=Integer.MIN_VALUE;
       int dif=Integer.MAX_VALUE;
       int [] range = new int[2];
       while(true){
           int min=Integer.MAX_VALUE;
           for(int i=0;i<pointers.length;i++){
               int num = nums.get(i).get(pointers[i]);
               min=Math.min(min,num);
               max=Math.max(max,num);
           }
           if(max-min<dif){
               dif=max-min;
               range[0]=min;
               range[1]=max;
           }
           for(int i=0;i<pointers.length;i++){
               if(min==nums.get(i).get(pointers[i])){
                   pointers[i]++;
               }
           }   
           for(int i=0;i<pointers.length;i++){
               if(nums.get(i).size()==pointers[i]){
                    return range;
               }
           }
       }
    }
}
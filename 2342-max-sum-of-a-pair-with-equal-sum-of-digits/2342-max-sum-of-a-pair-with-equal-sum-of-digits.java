class Solution {
  
    public int maximumSum(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>hm = new HashMap<>();
         for(int i=0;i<nums.length;i++){
             int dsum=digsum(nums[i]);
             if(hm.containsKey(dsum)){
                 hm.get(dsum).add(nums[i]);
             }
             else{
                ArrayList<Integer>ar=new ArrayList<>(); 
                ar.add(nums[i]); 
                hm.put(dsum,ar);   
             }
         }
         int maxsum=-1;
         for(int i:hm.keySet()){
             ArrayList<Integer>temp=hm.get(i);
             if(temp.size()>1){
                Collections.sort(temp); 
                maxsum=Math.max(maxsum,temp.get(temp.size()-1)+temp.get(temp.size()-2));
             }
         }
        return maxsum;
    }
    public int digsum(int num){
        int ans = 0;
        while(num>0){
            ans+=num%10;
            num/=10;    
        }
        return ans;
    }
   
}
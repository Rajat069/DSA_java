class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i:nums){
             hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int op=0;
        for(int key:hm.keySet()){
            int val=hm.get(key);
            if(val==1)return -1;
            int mod=val%3;
            if(mod==0){
              op+=val/3;   
            }
            else{
              op+=(val/3)+1;  
            }
        }
        return op;
    }
}
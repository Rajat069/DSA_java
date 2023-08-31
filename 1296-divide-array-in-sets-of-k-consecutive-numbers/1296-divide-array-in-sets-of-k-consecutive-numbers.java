class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)return false;
        TreeMap<Integer,Integer>hm = new TreeMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int key:hm.keySet()){
            int kk=key,v=hm.get(key);
            while(v>0){
                int c=1,prev=kk;
                while(c<k){
                    if(!hm.containsKey(prev+1)||hm.get(prev+1)<=0){
                        break;
                    }
                    if(hm.get(prev+1)>0)hm.put(prev+1,hm.get(prev+1)-1);
                    prev++;
                    c++;
                }
                if(c!=k)return false;
                v--;
            }
        }
        return true;
    }
}
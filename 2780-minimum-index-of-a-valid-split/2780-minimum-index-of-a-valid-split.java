class Solution {
    public int minimumIndex(List<Integer> nums) {
        if(nums.size()==1)return -1;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int maxf=0,num=0;
        if(freq.size()==1)return 0;
        for(int key:freq.keySet()){
            if(freq.get(key)>maxf){
                maxf=freq.get(key);
                num=key;
            }
        }
        int[] prefix = new int[nums.size()];
        int[] postfix = new int[nums.size()];
        prefix[0]=nums.get(0)==num?1:0;
        for(int i=1;i<nums.size();i++){
            prefix[i]=(nums.get(i)==num?1:0)+prefix[i-1];
        }
        int l=nums.size()-1;
        postfix[l]=nums.get(l)==num?1:0;
        for(int i=l-1;i>=0;i--){
            postfix[i]=(nums.get(i)==num?1:0)+postfix[i+1];
        }
        int idx=-1;
        for(int i=0;i<l;i++){
            if(prefix[i]*2>i+1&&postfix[i+1]*2>l-i){
                idx=i;
                break;
            }
        }
        return idx;
    }
}
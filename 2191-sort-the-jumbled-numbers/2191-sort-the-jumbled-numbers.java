class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Long[] boxed = new Long[nums.length];
        int idx=0;
        HashMap<Long,Long> hm = new HashMap<>();
        for(int num:nums){
            boxed[idx]=Long.valueOf(num);
            if(!hm.containsKey(boxed[idx])){
             StringBuilder sb1 = new StringBuilder();
             Long numA=boxed[idx];
             if(numA==0)sb1.append(Long.valueOf(mapping[0]));
             while(numA!=0){
               int i=(int)(numA%10); 
               sb1.append(Long.valueOf(mapping[i]));
               numA/=10; 
              }
              sb1.reverse();
              hm.put(boxed[idx],Long.parseLong(sb1.toString()));  
            }
            idx++;
        }
        Comparator<Long> comparator = (a, b) ->{
           Long newNum1 = hm.get(a);
           Long newNum2 = hm.get(b);
           return Long.compare(newNum1,newNum2);
        };
        Arrays.sort(boxed,comparator);
        idx=0;
        for(Long i:boxed){
            nums[idx++]=i.intValue();
        }
        return nums;
    }
}
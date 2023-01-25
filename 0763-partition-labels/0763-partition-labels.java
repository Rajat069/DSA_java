class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans_list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int maxidx=s.lastIndexOf(s.charAt(i));
            if(maxidx==-1){
                ans_list.add(s.length()-i+1);
                continue;
            }
            int j=i+1;
            while(j<s.length()&&j<=maxidx){
                int idx=s.lastIndexOf(s.charAt(j));
                if(idx>maxidx){
                    maxidx=idx;
                }
                j++;
            }
            ans_list.add(j-i);
            if(i!=j)i=j-1;
        }
        return ans_list;
    }
}
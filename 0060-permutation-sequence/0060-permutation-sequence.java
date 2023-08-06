class Solution {
    ArrayList<String>allPer = new ArrayList<>();
    HashSet<Integer>hs = new HashSet<>();
    public String getPermutation(int n, int k) {
        helper(n,new StringBuilder(),0,k);
        return allPer.get(k-1);
    }
    private void helper(int n,StringBuilder sb,int idx,int k){
        if(sb.length()==n){
            allPer.add(sb.toString());
            return;
        }
        if(idx==n||allPer.size()==k){
            return;
        }
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
            sb.append(i);
            hs.add(i);
            helper(n,sb,idx+1,k);
            hs.remove(i);   
            sb.deleteCharAt(sb.length()-1);
            }
        }
        
    }
}
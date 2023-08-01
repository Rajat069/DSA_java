class Solution {
    public List<List<Integer>> combine(int n, int k) {
        DFS(1,n,k,new ArrayList<>());
        return sol;
    }
    List<List<Integer>> sol = new ArrayList<>();
    public void DFS(int start,int n,int k,List<Integer> temp) {
        if (k == temp.size()) {
            sol.add(new ArrayList<>(temp)); 
            return;
        }
        for(int q=start;q<=n;q++){
         temp.add(q);
         DFS(q+1,n,k,temp);
         temp.remove(temp.size() - 1);   
        }
    }

}
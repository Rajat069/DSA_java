class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        HelperComb(new ArrayList<>(),k,n,1,0);
        return sol; 
    }
    List<List<Integer>> sol = new ArrayList<>();
    public void HelperComb(ArrayList<Integer>temp,int size,int tar,int idx,int cursum){
        if(cursum==tar&&temp.size()==size){
            sol.add(new ArrayList<Integer>(temp));
            return;
        }
        if(temp.size()>size||cursum>tar||idx>9){
             return;
        }
        for(int i=idx;i<=9;i++){
            temp.add(i);
            HelperComb(temp,size,tar,i+1,cursum+i);
            temp.remove(temp.size()-1);
        }
        
    }
}
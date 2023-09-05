class Solution {
    public List<Integer> getRow(int rowIndex) {
    if(rowIndex==0){
      List<Integer>ls = new ArrayList<>();
      ls.add(1);  
      return ls;   
    }
    List<List<Integer>> ar = new ArrayList<>();
    for(int i=0;i<=rowIndex;i++){
        List<Integer>ls = new ArrayList<>();
        ls.add(1);
        for(int q=1;q<i;q++){
            List<Integer> temp = ar.get(i-1);
            ls.add(temp.get(q-1)+temp.get(q));
         }
          if(i!=0)ls.add(1);
          ar.add(ls);
        }
        return ar.get(ar.size()-1);
    }
}
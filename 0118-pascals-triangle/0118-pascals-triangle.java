class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ar = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>ls = new ArrayList<>();
            ls.add(1);
            for(int q=1;q<i;q++){
                List<Integer> temp = ar.get(i-1);
                ls.add(temp.get(q-1)+temp.get(q));
            }
            if(i!=0)ls.add(1);
            ar.add(ls);
        }
        return ar;
    }
}
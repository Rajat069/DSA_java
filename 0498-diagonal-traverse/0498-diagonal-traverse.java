class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(hm.containsKey(i+j)){
                    hm.get(i+j).add(mat[i][j]);
                }
                else{
                    ArrayList<Integer>ar = new ArrayList<>();
                    ar.add(mat[i][j]);
                    hm.put(i+j,ar);
                }
            }
        }
        int[] sol = new int[mat.length*mat[0].length];
        for(int i=0,idx=0;i<=(mat.length-1+mat[0].length-1);i++){
            ArrayList<Integer>temp = hm.get(i);
            boolean rev=i%2!=0?true:false;
            if(rev){
               for(int j=0;j<temp.size();j++){
                sol[idx++]=temp.get(j);
               }   
            }
            else{
               for(int j=temp.size()-1;j>=0;j--){
                sol[idx++]=temp.get(j);
               }
            }
        }
        return sol;
    }
}
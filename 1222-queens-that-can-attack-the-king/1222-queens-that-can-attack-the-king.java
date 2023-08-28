class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>>sol = new ArrayList<>();
        HashSet<String>hs = new HashSet<>();
        for(int[]pos:queens){
            hs.add(pos[0]+"-"+pos[1]);
        }
        int r=king[0],c=king[1];
        int count=0;
        for(int i=c;i<8;i++){
            if(hs.contains(r+"-"+i)){
                List<Integer>temp = new ArrayList<>();
                temp.add(r);
                temp.add(i);
                sol.add(temp);
                break;
            }
        }
        for(int i=c;i>=0;i--){
            if(hs.contains(r+"-"+i)){
               List<Integer>temp = new ArrayList<>();
                temp.add(r);
                temp.add(i);
                sol.add(temp);
                break;
            }
        }
        for(int i=r;i<8;i++){
            if(hs.contains(i+"-"+c)){
               List<Integer>temp = new ArrayList<>();
                temp.add(i);
                temp.add(c);
                sol.add(temp);
                break;
            }
        }
        for(int i=r;i>=0;i--){
            if(hs.contains(i+"-"+c)){
               List<Integer>temp = new ArrayList<>();
                temp.add(i);
                temp.add(c);
                sol.add(temp);
                break;
            }
        }
        for(int i=r,j=c;i<8;i++,j++){
            if(hs.contains(i+"-"+j)){
                List<Integer>temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                sol.add(temp);
                break;
            }
        }
        for(int i=r,j=c;i>=0;i--,j--){
            if(hs.contains(i+"-"+j)){
                List<Integer>temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                sol.add(temp);
                break;
            }
        }
        for(int i=r,j=c;i<8&&j>=0;i++,j--){
            if(hs.contains(i+"-"+j)){
                List<Integer>temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                sol.add(temp);
                break;
            }
        }
        for(int i=r,j=c;i>=0&&j<8;i--,j++){
            if(hs.contains(i+"-"+j)){
                List<Integer>temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                sol.add(temp);
                break;
            }
        }
        return sol;
    }
}
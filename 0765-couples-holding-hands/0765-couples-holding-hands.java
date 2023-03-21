class Solution {
    HashMap<Integer,Integer>hm = new HashMap<>();
    public int minSwapsCouples(int[] row) {
        for(int i=0;i<row.length;i++){
            hm.put(row[i],i);
        }
        int swaps=0;
        for(int i=0;i<row.length;i+=2){
            int partner1 = row[i];
            int partner2 = row[i]^1;
            
            if(partner2!=row[i+1]){
                swaps++;
                swap(row,i+1,hm.get(partner2));
            }
        }
        return swaps;
    }
    public void swap(int[] pos,int cur_pos,int pat_pos){
        int temp = pos[cur_pos];
        pos[cur_pos] = pos[pat_pos];
        pos[pat_pos] = temp;
        
        hm.put(pos[cur_pos],cur_pos);
        hm.put(pos[pat_pos],pat_pos);
    }
}
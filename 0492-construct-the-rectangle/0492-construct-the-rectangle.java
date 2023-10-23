class Solution {
    public int[] constructRectangle(int area) {
        ArrayList<Integer>factors=new ArrayList<>();
        for(int i=1; i * i <= area; i++) {
            if (area % i == 0) {
                factors.add(i);
                if (i != area/i) {
                    factors.add(area/i);
                }
            }
        }
        Collections.sort(factors);
        int prev=1;
        int[]ar=new int[2];
        int minDif=Integer.MAX_VALUE;
        for(int i=1;i<factors.size()-1;i++){
            int cur=factors.get(i);
            if(cur*cur==area)return new int[]{cur,cur};
            if(prev*cur==area&&cur-prev<minDif){
                ar[1]=prev;
                ar[0]=cur;
            }
            prev=cur;
        }
        if(ar[0]==0)return new int[]{factors.get(factors.size()-1),factors.get(0)};
        return ar;
    }
}
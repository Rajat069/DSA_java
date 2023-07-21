class Solution {
    public int maximumPopulation(int[][] logs) {
        HashMap<Integer,Integer> years = new HashMap<>();
        for(int[]ar:logs){
            for(int i=ar[0];i<ar[1];i++){
                years.put(i,years.getOrDefault(i,0)+1);
            }
        }
        int maxPop=0,yr=2051;
        for(int year:years.keySet()){
            if(years.get(year)>=maxPop){
                if(years.get(year)==maxPop){
                    yr=Math.min(yr,year);
                }
                else yr=year;
                maxPop=years.get(year);
            }
        }
        return yr;
    }
}
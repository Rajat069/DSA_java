class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int s=0,l=0;
        int max_fruits=0;
        while(l<fruits.length){
            hm.put(fruits[l],hm.getOrDefault(fruits[l],0)+1);
            while(hm.size()>2){
                hm.put(fruits[s],hm.getOrDefault(fruits[s],0)-1);
                if(hm.get(fruits[s])==0){
                    hm.remove(fruits[s]);
                }
                s++;
            }
            max_fruits=Math.max(max_fruits,l-s+1);
            l++;
        }
        return max_fruits;
    }
}
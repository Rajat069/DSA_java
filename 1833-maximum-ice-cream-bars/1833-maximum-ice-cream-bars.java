class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sol=0;
        for(int i:costs){
            if(i>coins){
                break;
            }
            sol++;
            coins-=i;
        }
        return sol;
    }
}
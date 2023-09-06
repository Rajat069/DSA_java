class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        for(int i=players.length-1,j=trainers.length-1;i>=0&&j>=0;i--){
            if(players[i]<=trainers[j]){
                count++;
                j--;
            }
        }
        return count;
    }
}
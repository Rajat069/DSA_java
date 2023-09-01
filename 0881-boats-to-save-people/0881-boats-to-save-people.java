class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p=0,f=people.length-1;
        int count=0;
        while(p<=f){
            if(people[p]+people[f]<=limit){
                count++;
                p++;
                f--;
            }
            else{
                f--;
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk.length==1)return 0;
        int rep=0;
        int idx=0;
        long sum=0;
        for(int i:chalk){
            sum+=i;
        }
        k%=sum;
        while(true){
            if(k>=chalk[idx])k-=chalk[idx];
            else{
                rep=idx;
                break;
            }
            idx=(idx+1)%chalk.length;
        }
        return rep;
    }
}
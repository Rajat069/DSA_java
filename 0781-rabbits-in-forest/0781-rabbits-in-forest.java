class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int sol=0;
        for(int i=0;i<answers.length;i++){
            int c=0,num=answers[i];
            while(i<answers.length&&num==answers[i]){
                i++;
                c++;
            }
            int pair = c/(num+1);
            pair=pair==0?1:pair*(num+1)==c?pair:pair+1;
            sol+=(pair*(num+1));
            if(i!=answers.length)i--;
        }
        return sol;
        
    }
}
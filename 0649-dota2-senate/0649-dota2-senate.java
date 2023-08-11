class Solution {
    public String predictPartyVictory(String senate) {
        if(senate.length()==1)return senate.charAt(0)=='R'?"Radiant":"Dire";
        Deque<Character>queue = new ArrayDeque<>();
        int[]freq = new int[2];
        for(char c:senate.toCharArray()){
            if(c=='R'){
                freq[0]++;
            }
            else freq[1]++;
            queue.offer(c);
        }
        while(freq[0]!=0&&freq[1]!=0){
            char c = queue.poll();
            int idx=1,size=queue.size();
            while(!queue.isEmpty()&&queue.peek()==c){
                queue.poll();
                if(idx>size){
                    break;
                }
                idx++;
            }
            char del=queue.poll();
            if(del=='R'){
                freq[0]--;
            }
            else freq[1]--;
            while(idx>1){
                queue.addFirst(c);
                idx--;
            }
            queue.offer(c);
        }
        return queue.peek()=='D'?"Dire":"Radiant";
    }
}
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] ar = new int[26];
        for(char c:s.toCharArray()){ 
            ar[c-'a']++;
        }
        boolean[] seen = new boolean[26]; //using this array to avoid similer character
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            int idx=temp-'a';
            ar[idx]--;
            if(seen[idx])continue;
            while(!st.isEmpty()&&st.peek()>temp&&ar[st.peek()-'a']>0){ //here peek is used to check if there exist any element further in string with the help of ar array ar 
                seen[st.pop()-'a']=false;
            }
            st.push(temp);
            seen[idx]=true;
        }
        StringBuilder sb = new StringBuilder();
        for(Character t:st){
            sb.append(t);
        }
        return sb.toString();
    }
}
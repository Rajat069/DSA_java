class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ar[] = new int[26];
        Arrays.fill(ar,0);
        for(int i=0;i<ransomNote.length();i++){
            ar[ransomNote.charAt(i)-'a']++;
        }
         for(int i=0;i<magazine.length();i++){
            ar[magazine.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ar[i]>0)return false;
        }
        return true;
    }
}
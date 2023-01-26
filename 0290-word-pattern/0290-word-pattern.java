class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ar = s.split(" ");
        if(ar.length!=pattern.length())return false;
        HashMap<String,String> hm = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            String temp =pattern.charAt(i)+"";
            if(hm.containsKey(temp)&&!hm.get(temp).equals(ar[i]))return false;
            else if(!hm.containsKey(temp)&&hm.containsValue(ar[i]))return false;
            else hm.put(temp,ar[i]);
        }
        return true;
    }
}
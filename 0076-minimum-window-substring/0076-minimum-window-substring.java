class Solution {
    public String minWindow(String s, String t) {
        String sol="";
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer> hm2 = new HashMap<>();
        int matched=0;
        int needTo=t.length(),r=0,l=0;
        while(true){
            boolean flag1=false,flag2=false;
            while(r<s.length()&&matched<needTo){
                char ch= s.charAt(r);
                 r++;
                hm2.put(ch,hm2.getOrDefault(ch,0)+1);
 if(hm2.getOrDefault(ch,0)<=hm1.getOrDefault(ch,0)){
                    matched++;
                }
                flag1=true;
            }
            while(l<r&&matched==needTo){
                String sub = s.substring(l,r);
                char ch = s.charAt(l);
                if(sol.length()==0||sub.length()<sol.length()){
                    sol=sub;
                }
                if(hm2.get(ch)==1){
                    hm2.remove(ch);
                }
                else{
                    hm2.put(ch,hm2.get(ch)-1);
                }
                l++;
                if(hm2.getOrDefault(ch,0)<hm1.getOrDefault(ch,0)){
                    matched--;
                }
                flag2=true;
            }
            if(!flag1&&!flag2){
                break;
            }
        }
        return sol;
    }
}
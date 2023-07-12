class Solution {
    HashMap<Character,Integer> hm = new HashMap<>();
    public int romanToInt(String s) {
        map();
        int num=0;
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1&&hm.get(s.charAt(i+1))>hm.get(s.charAt(i))){
                num+=hm.get(s.charAt(i+1))-hm.get(s.charAt(i));
                i++;
            }
            else{
                num+=hm.get(s.charAt(i));
            }                                      
       }
       return num; 
   }
    public void map(){
       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000); 
    }
}
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] ar = title.split(" ");
        for(String s:ar){
            if(s.length()>2){
                StringBuilder sb1= new StringBuilder(s.toLowerCase());
                sb1.setCharAt(0,Character.toUpperCase(sb1.charAt(0)));
                sb.append(sb1+" "); 
            }
            else sb.append(s.toLowerCase()+" ");
        }
        return sb.toString().trim();
    }
}
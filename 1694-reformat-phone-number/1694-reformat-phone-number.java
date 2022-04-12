class Solution {
    public String reformatNumber(String number) {
        String ans = "";
        for(char c:number.toCharArray()){
            if(Character.isDigit(c))ans+=c;
        }
        String refom = "";
        for(int i=0;i<ans.length();i+=3){
            int remlen = ans.length()-i;
            if(remlen==4){
                refom+=ans.substring(i,i+2);
                refom+='-';
                refom+=ans.substring(i+2);
                i++;
            }
            else {
                if(remlen==2) refom+=ans.substring(i,i+2);
                else refom+=ans.substring(i,i+3);
                refom+='-';
            }
        }
        if(refom.charAt(refom.length()-1)=='-')return refom.substring(0,refom.length()-1);
        return refom;
    }
}
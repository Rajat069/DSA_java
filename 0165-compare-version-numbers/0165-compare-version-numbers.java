class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int m=Math.max(ver1.length,ver2.length);
        int[] len1 = new int[m];
        int[] len2 = new int[m];
        int p=0;
        for(String s:ver1){
            int idx=0;
            while(idx<s.length()&&s.charAt(idx)=='0'){
                idx++;
            }
            String temp = s.substring(idx);
            if(temp.length()==0){
                len1[p]=0;
            }else len1[p]=Integer.parseInt(temp);
           p++;
        }
        p=0;
        for(String s:ver2){
            int idx=0;
            while(idx<s.length()&&s.charAt(idx)=='0'){
                idx++;
            }
            String temp = s.substring(idx);
            if(temp.length()==0){
                len2[p]=0;
            }else len2[p]=Integer.parseInt(temp);
           p++;
        }
        int i=0;
        while(i<m){
            if(len1[i]>len2[i])return 1;
            else if(len1[i]<len2[i])return -1;
            i++;
        }
        return 0;
    }
}
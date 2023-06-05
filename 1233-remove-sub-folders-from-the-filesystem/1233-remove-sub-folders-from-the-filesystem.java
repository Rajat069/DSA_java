class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String>sol = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        Arrays.sort(folder,(a,b)->(a.length()-b.length()));
        for(String s:folder){
            String subs[] = s.split("/");
            StringBuilder fld=new StringBuilder();
            boolean add=true;
            for(String fl:subs){
                if(fl.length()!=0)fld.append("/"+fl);
                if(hs.contains(fld.toString())){
                    add=false;
                    break;
                }
            }
            if(add){
              sol.add(s);
              hs.add(s);
            }
           
        }
        return sol;
    }
}
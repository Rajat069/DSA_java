class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String>sol = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();  //for contains Method
        Arrays.sort(folder,(a,b)->(a.length()-b.length())); //sorting according to length
        for(String s:folder){
            String subs[] = s.split("/"); //spliting into subfolders
            StringBuilder fld=new StringBuilder();
            boolean add=true;
            for(String fl:subs){
                if(fl.length()!=0)fld.append("/"+fl); //if not empty(empty string is formed due to "/a" splitting into "" and a) we append it to the sb to check for parent folder
                if(hs.contains(fld.toString())){ //if it already exists in the system we continue ahead and dont add it to the arraylist by doing the add to false and breaking out of the loop
                    add=false; 
                    break;
                }
            }
            if(add){ // we only add both incase it dont exists
              sol.add(s);
              hs.add(s);
            }
           
        }
        return sol;
    }
}
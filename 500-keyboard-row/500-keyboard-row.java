class Solution {
    public String key1 = "qwertyuiop";
    public String key2 = "asdfghjkl";
    public String key3 = "zxcvbnm";
    
     public  String[] findWords(String[] words) {
            ArrayList<String> ans = new ArrayList<>();
            for(int k=0;k< words.length;k++){
                String wo = words[k];
                int c =0;
                for(int i=0;i<words[k].length()&&c==0;i++){
                    if(key1.contains(""+Character.toLowerCase(wo.charAt(i)))){
                        while(i<words[k].length()){
                            if(!key1.contains(""+Character.toLowerCase(wo.charAt(i)))){
                                c++;
                                break;
                            }
                            i++;
                        }
                    }
                    else if(key2.contains(""+Character.toLowerCase(words[k].charAt(i)))){
                        while(i<words[k].length()){
                            if(!key2.contains(""+Character.toLowerCase(wo.charAt(i)))){
                                c++;
                                break;
                            }
                            i++;
                        }
                    }
                    else{
                        while(i<words[k].length()){
                            if(!key3.contains(""+Character.toLowerCase(wo.charAt(i)))){
                                c++;
                                break;
                            }
                            i++;
                        }

                    }

                }
                if(c==0)ans.add(wo);
            }
            String[] ar = new String[ans.size()];
            for(int i=0;i<ans.size();i++){
                ar[i]=ans.get(i);
            }
            return ar;
        }
}
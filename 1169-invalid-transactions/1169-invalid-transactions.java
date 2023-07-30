class Solution {
    public class Transaction{
        String name;
        int time;
        int amt;
        String City;
        Transaction( String name,int time,int amt,String City){
            this.name=name;
            this.time=time;
            this.amt=amt;
            this.City=City;
        }
        @Override
       public String toString() {
          return name+","+String.valueOf(time)+","+String.valueOf(amt)+","+City;
       }
    }
    public List<String> invalidTransactions(String[] transactions) {
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<Transaction> ar = new ArrayList<>();
        for(String s:transactions){
            String[] t1 = s.split(",");
            Transaction obj = new Transaction(t1[0],Integer.valueOf(t1[1]),Integer.valueOf(t1[2]),t1[3]);
            ar.add(obj);
            hm.put(obj.toString(),hm.getOrDefault(obj.toString(),0)+1);
        }
        List<String> sol = new ArrayList<>();
        Collections.sort(ar, (a, b) -> a.name.compareTo(b.name));
        for(int i=0;i<ar.size();i++){
            boolean flag=false;
            String name = ar.get(i).name;
            ArrayList<Transaction> temp = new ArrayList<>();
            while(i<ar.size()&&ar.get(i).name.equals(name)){
                temp.add(ar.get(i));
                i++;
                flag=true;
            }
            if(flag)i--;
            for(int t=0;t<temp.size();t++){
                Transaction obj1 = temp.get(t);
                if(obj1.amt>1000)sol.add(obj1.toString());                                                   String CITY=obj1.City;
                for(int q=t+1;q<temp.size();q++){
                    Transaction obj2 = temp.get(q);
                    if(!CITY.equals(obj2.City)&&Math.abs(obj2.time-obj1.time)<=60){
                        sol.add(obj2.toString());
                        sol.add(obj1.toString());
                    }
                }
            }            
        }
        HashMap<String,Integer> freqCheck = new HashMap<>();
            for(String s:sol){
                freqCheck.put(s,freqCheck.getOrDefault(s,0)+1);
            }
            List<String>finalSol =new ArrayList<>();
            for(String s:freqCheck.keySet()){
                int org = hm.get(s);
                int cur = freqCheck.get(s);
                for(int i=0;i<Math.min(org,cur);i++){
                    finalSol.add(s);
                }
            }
        return finalSol;
    }
}
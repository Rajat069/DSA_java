class Solution {
    public boolean reorderedPowerOf2(int n) {
      HashSet<String> hs = new HashSet<>();
      for(int i=0;i<=30;i++){
          int val = (int)(Math.pow(2,i));
          int digits = (int)(Math.log10(val) + 1) , idx=0;
          char ar[] = new char[digits];
          while(val!=0){
              ar[idx++]=(char)(val%10);
              val/=10;
           }
           Arrays.sort(ar);
           hs.add(String.valueOf(ar));
          }
          int digits = (int)(Math.log10(n) + 1) ,idx=0;
          char ar[] = new char[digits];          
          while(n!=0){
              ar[idx++]=(char)(n%10);
              n/=10;
          }
          Arrays.sort(ar);
          return hs.contains(String.valueOf(ar));
    }
}
class Solution {
    public int percentageLetter(String s, char letter) {
           String[] ar = s.split("");
            int ans=0;
            Arrays.sort(ar);
            if(ar[0].charAt(0)<letter&&ar[ar.length/2].charAt(0)<=letter){
                for(int i=ar.length-1;i>=0;i--){
                    if(ar[i].equals(letter+"")){
                        while(i<ar.length&&ar[i].equals(letter+"")) {
                            ans++;
                            i--;
                        }
                        break;
                    }
                }
                float req = ans*100/ar.length;
                return (int)req;
            }
            else{
                for(int i=0;i<ar.length;i++){
                    if(ar[i].equals(letter+"")){
                        while(i<ar.length&&ar[i].equals(letter+"")) {
                            ans++;
                            i++;
                        }
                        break;
                    }
                }
                float req = ans*100/ar.length;
                return (int)req;
            }
        }
}   
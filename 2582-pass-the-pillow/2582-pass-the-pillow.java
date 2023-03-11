class Solution {
   public int passThePillow(int n, int time) {
    int pos = 1;
    boolean dir = true;
    while (time != 0) {
         if(dir)pos++;
         else pos--;
         if(pos==n)dir=false;
         else if(pos==1)dir=true;
         time--;
    }
    return pos;
  }
}
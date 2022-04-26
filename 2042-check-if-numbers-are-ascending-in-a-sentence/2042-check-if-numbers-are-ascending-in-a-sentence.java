class Solution {
    public boolean areNumbersAscending(String s) {
             String st[] = s.split(" ");
        int temp = Integer.MIN_VALUE;
        for(String s1:st){
             if(s1.matches("[0-9]+")){
                 int num = Integer.valueOf(s1);
                 if(temp>=num){
                    return false;     
                 }
                 temp=num;
             }
        }
        return true;
    }
}
class Solution {
    public boolean isRobotBounded(String instructions) {
        return DirHelper(instructions);
    }
    private boolean DirHelper(String ins){
        int x=0,y=0,dir=0;
        for(int i=0;i<ins.length();i++){
            char ch = ins.charAt(i);
            if(ch=='G'){
                if(dir==0){
                   x++;
                }
                else if(dir==1){
                    y++;
                }
                else if(dir==2){
                    x--;
                }
                else{
                    y--;
                }
            }
            else if(ch=='L'){
                dir=(dir+1)%4;
            }
            else{
                dir=(dir+3)%4;
            }
        }
        return dir!=0||(x==0&&y==0);
    }
}
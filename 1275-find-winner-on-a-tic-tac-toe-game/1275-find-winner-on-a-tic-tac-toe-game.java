class Solution {
    public String tictactoe(int[][] moves) {
        Character ar[][]= new Character [3][3];
        for(Character ch[]:ar){
             Arrays.fill(ch,'.');
        }
        for(int i=0;i<moves.length;i++){
            if(i%2==0){
                ar[moves[i][0]][moves[i][1]]='X';
            }
            else{
                 ar[moves[i][0]][moves[i][1]]='O';
            }
        }
        return winnercheck(ar);
    }
    public String winnercheck(Character[][]ch){
        
    
            for(int i=0;i<3;i++){
                int countx=0;
                int counto=0;
                int j=0;
                while(j<3){
                    if(ch[i][j]=='X')countx++;
                    else if(ch[i][j]=='O')counto++;
                    j++;
                }
                if(countx==3)return "A";
                else if(counto==3)return "B";
            }


            for(int i=0;i<3;i++){
                int countx1=0;
                int counto1=0;
                int j=0;
                while(j<3){
                    if(ch[j][i]=='X')countx1++;
                    else if(ch[j][i]=='O')counto1++;
                    j++;
                }
                if(countx1==3)return "A";
                else if(counto1==3)return "B";
            }


            int countx2=0;
            int counto2=0;
            for(int i=0;i<3;i++){
                if(ch[i][i]=='X')countx2++;
                else if(ch[i][i]=='O')counto2++;
            }
            if(countx2==3)return "A";
            else if(counto2==3)return "B";


            int countx3=0;
            int counto3=0;
            int j=0;
            for(int i=2;i>-1;i--){
                if(ch[i][j]=='X')countx3++;
                else if(ch[i][j]=='O')counto3++;
                j++;
            }
            if(countx3==3)return "A";
            else if(counto3==3)return "B";


            int countt=0;
            for(int i=0;i<3;i++){
                int j1=0;
                while(j1<3){
                    if(ch[i][j1]=='X')countt++;
                    else if(ch[i][j1]=='O')countt++;
                    j1++;
                }
            }
            if(countt==9)return "Draw";
            return "Pending";
        }
      
}
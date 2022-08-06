class Solution {
    public String intToRoman(int num) {
        int temp = num;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int pre = 0;
        while(num>0){
            int last = temp%(int)Math.pow(10,count)-pre;
            pre+=last;
            if(count==1){
                  if(last<4){
                for(int i=0;i<last;i++){
                    sb.append("I");
                }
            }
            else if(last==4){
                    sb.append("IV");
            }
            else if(last>4&&last<=8){
                   sb.append("V");
                   for(int i=0;i<last-5;i++){
                       sb.append("I");
                   }
               }
            else {
                sb.append("IX");
            }   
            }
            else if(count==2){
                if(last>=10&&last<40){
                    for(int i=0;i<last/10;i++){
                        sb.insert(0,"X");
                    }
                }
                else if(last==40){
                    sb.insert(0,"XL");
                }
                else if(last==90){
                    sb.insert(0,"XC");
                }
                else if(last>=10){
                   sb.insert(0,"L");
                    for(int i=0;i<last/10-5;i++){
                        sb.insert(i+1,"X");
                    }
                }
            }
            else if(count==3){
                if(last>=100&&last<400){
                    for(int i=0;i<last/100;i++){
                        sb.insert(0,"C");
                    }
                }
                else if(last==400){
                    sb.insert(0,"CD");
                }
                else if(last==900){
                    sb.insert(0,"CM");
                }
                else if(last>=100) {
                    sb.insert(0,"D");
                    for(int i=0;i<last/100-5;i++){
                        sb.insert(i+1,"C");
                    }
                }
            }
            else{
                for(int i=0;i<last/1000;i++){
                   sb.insert(0,"M");
                }
            }
            count++;
            num/=10;
        }
        return sb.toString();
    }
}
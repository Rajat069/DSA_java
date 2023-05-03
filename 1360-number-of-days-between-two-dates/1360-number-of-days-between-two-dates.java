class Solution {
    public int [] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) {
        String ar1[] = date1.split("-");
        String ar2[] = date2.split("-");
        int big = 1;
        for(int i=0;i<3;i++){
            if(Integer.parseInt(ar1[i])<Integer.parseInt(ar2[i])){
                big=2;
                break;
            }
            else if(Integer.parseInt(ar1[i])>Integer.parseInt(ar2[i])){
                big=1;
                break;
            }  
        }
        if(big==2){
          String temp[] = ar1;
          ar1=ar2;
          ar2=temp;  
        }
        System.out.println(Arrays.toString(ar1)+"  "+Arrays.toString(ar2));
        int days=0;
        int year1 = Integer.parseInt(ar2[0]);
        int year2 = Integer.parseInt(ar1[0]);
        for(int i=year1;i<year2;i++){
            days+=isLeap(i)?366:365;
        }
        int temp=0;
        for(int i=0;i<Integer.parseInt(ar2[1])-1;i++){
            days-=isLeap(year1)?i==1?29:months[i]:months[i];
        }
        for(int i=0;i<Integer.parseInt(ar1[1])-1;i++){
            days+=isLeap(year2)?i==1?29:months[i]:months[i];
        }
        days-=Integer.parseInt(ar2[2]);
        days+=Integer.parseInt(ar1[2]);
        return days;
    }
    public static boolean isLeap(int year){
        if(year%4==0&&year%100!=0||year%400==0)return true;
        return false;
    }
}
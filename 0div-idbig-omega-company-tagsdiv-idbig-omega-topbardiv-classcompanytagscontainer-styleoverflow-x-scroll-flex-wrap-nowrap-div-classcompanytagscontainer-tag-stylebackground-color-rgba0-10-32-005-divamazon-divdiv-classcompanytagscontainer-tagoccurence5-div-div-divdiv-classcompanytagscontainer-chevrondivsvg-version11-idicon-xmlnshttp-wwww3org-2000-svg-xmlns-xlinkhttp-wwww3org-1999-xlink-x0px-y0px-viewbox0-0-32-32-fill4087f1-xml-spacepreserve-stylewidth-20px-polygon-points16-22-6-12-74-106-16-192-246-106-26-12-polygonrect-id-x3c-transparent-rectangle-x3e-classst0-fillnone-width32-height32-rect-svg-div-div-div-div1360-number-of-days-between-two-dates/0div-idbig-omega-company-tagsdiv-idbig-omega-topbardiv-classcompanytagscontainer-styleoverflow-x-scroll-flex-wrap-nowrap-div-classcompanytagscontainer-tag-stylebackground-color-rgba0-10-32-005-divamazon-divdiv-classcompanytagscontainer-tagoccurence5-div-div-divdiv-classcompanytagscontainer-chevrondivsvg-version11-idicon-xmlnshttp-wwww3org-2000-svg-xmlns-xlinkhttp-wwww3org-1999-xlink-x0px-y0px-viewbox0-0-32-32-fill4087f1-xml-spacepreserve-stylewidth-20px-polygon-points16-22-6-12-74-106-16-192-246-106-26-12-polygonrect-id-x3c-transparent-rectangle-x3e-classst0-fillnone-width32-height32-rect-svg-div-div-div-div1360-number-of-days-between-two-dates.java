class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(Since1971(date1)-Since1971(date2));
    }
    private int[]days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int Since1971(String date){
        String[]d = date.split("-");
        int totaldays=0;
        for(int i=1971;i<Integer.parseInt(d[0]);i++){
            totaldays+=isLeap(i)?366:365;
        }
        for(int i=1;i<Integer.parseInt(d[1]);i++){
            totaldays+=isLeap(Integer.parseInt(d[0]))?i==2?29:days[i]:days[i];
        }
        totaldays+=Integer.parseInt(d[2]);
        return totaldays;
    }
    private boolean isLeap(int year){
       return year%400==0||year%100!=0&&year%4==0;
    }
}
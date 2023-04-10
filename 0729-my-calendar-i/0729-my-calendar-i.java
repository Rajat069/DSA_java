class MyCalendar {
    ArrayList<ArrayList<Integer>> arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        ArrayList<Integer> booking = new ArrayList<>();
        booking.add(start);
        booking.add(end);
        return isoverlap(booking);
    }
    public boolean isoverlap(ArrayList<Integer> booking){
    ArrayList<ArrayList<Integer>> overlaps = new ArrayList<>();
    overlaps.addAll(arr);
    overlaps.add(booking);
    Comparator<ArrayList<Integer>> comparator = new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                int val1 = list1.get(0);
                int val2 = list2.get(0);
                return Integer.compare(val1, val2);
            }
        };
    Collections.sort(overlaps,comparator);
    int count=0;
    for(int i=1;i<overlaps.size();i++){
        if(overlaps.get(i).get(0)<overlaps.get(i-1).get(1)){
            count++;
            break;
        }
    }
    if(count!=0){
        return false;
    }
    arr.add(booking);
    Collections.sort(overlaps,comparator);
    return true;
}

}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
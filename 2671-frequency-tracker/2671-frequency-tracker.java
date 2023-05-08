import java.util.HashMap;

class FrequencyTracker {
    HashMap<Integer, Integer> hm, hm2;

    public FrequencyTracker() {
        hm = new HashMap<>();
        hm2 = new HashMap<>();
    }

    public void add(int number) {
        Integer prev = hm.getOrDefault(number, 0);
        if(prev!=null){
           hm2.put(prev, hm2.getOrDefault(prev, 0) - 1); 
        }
        hm.put(number,hm.getOrDefault(number,0)+1);
        hm2.put(hm.get(number), hm2.getOrDefault(hm.get(number), 0) + 1);
    }

    public void deleteOne(int number) {
        if (hm.containsKey(number)) {
            int tempfreq = hm.get(number);
            hm2.put(tempfreq, hm2.getOrDefault(tempfreq, 0) - 1);
            if (hm.get(number) == 1)
                hm.remove(number);
            else{
                hm.put(number, hm.getOrDefault(number, 0) - 1);
                hm2.put(hm.get(number),hm2.get(hm.get(number))+1);
            }
    
        }
    }

    public boolean hasFrequency(int frequency) {
        return hm2.containsKey(frequency) && hm2.get(frequency) != 0;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */

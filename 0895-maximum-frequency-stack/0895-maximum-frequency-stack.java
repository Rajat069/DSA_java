import java.util.*;

class FreqStack {
    Map<Integer, Integer> freqMap;
    PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> maxHeap;
    int sequence;

    public FreqStack() {
        freqMap = new HashMap<>();
        maxHeap = new PriorityQueue<>((a, b) -> {
            int freqA = a.getValue().getKey();
            int freqB = b.getValue().getKey();
            int seqA = a.getValue().getValue();
            int seqB = b.getValue().getValue();

            if (freqA != freqB) {
                return freqB - freqA; // Sort by frequency (highest first)
            } else {
                return seqB - seqA; // If frequencies are equal, sort by sequence (highest first)
            }
        });
        sequence = 0;
    }

    public void push(int val) {
        int freq = freqMap.getOrDefault(val, 0) + 1;
        freqMap.put(val, freq);
        maxHeap.offer(new Pair<>(val, new Pair<>(freq, sequence++)));
    }

    public int pop() {
        Pair<Integer, Pair<Integer, Integer>> pair = maxHeap.poll();
        int val = pair.getKey();
        int freq = pair.getValue().getKey();
        if (freqMap.get(val) == 1) {
            freqMap.remove(val);
        } else {
            freqMap.put(val, freq - 1);
        }
        return val;
    }
}

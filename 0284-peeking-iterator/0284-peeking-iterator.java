// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer>ar;
    int cur=0;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    ar=new ArrayList<>();
        while(iterator.hasNext()){
            ar.add(iterator.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ar.get(cur);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return ar.get(cur++);
	}
	
	@Override
	public boolean hasNext() {
	    return cur!=ar.size();
	}
}
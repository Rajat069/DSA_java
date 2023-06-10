// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    it=iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        ArrayList<Integer>ar=new ArrayList<>();
        while(it.hasNext()){
            ar.add(it.next());
        }
        Iterator<Integer> iterator = ar.iterator();
        it=ar.iterator();
        return iterator.next();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return it.next();
	}
	
	@Override
	public boolean hasNext() {
	    return it.hasNext();
	}
}
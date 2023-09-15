/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private ArrayList<Integer>ar = new ArrayList<>();
    int idx=0;
    private void helper(List<NestedInteger>ls){
        for(int i=0;i<ls.size();i++){
            NestedInteger item = ls.get(i);
            if(item.isInteger()){
                ar.add(item.getInteger());
            }
            else helper(ls.get(i).getList());
        }
    }
    public NestedIterator(List<NestedInteger> nestedList) {
        helper(nestedList);
    }

    @Override
    public Integer next() {
        return ar.get(idx++);
    }

    @Override
    public boolean hasNext() {
        return idx<ar.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
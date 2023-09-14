class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for(List<String> ticket : tickets){
            graph.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>()).add(ticket.get(1));
        }
        Stack<String>stack = new Stack<>();
        stack.add("JFK");
        LinkedList<String>itinerary = new LinkedList<>();
        while (!stack.isEmpty()) {
            while(graph.getOrDefault(stack.peek(),new PriorityQueue<>()).size()>0) {
                stack.add(graph.get(stack.peek()).poll());
            }
            itinerary.addFirst(stack.pop());
        }
        return itinerary;
    }
}
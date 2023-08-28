class Twitter {
    HashMap<Integer,LinkedList<Pair<Integer,Integer>>>users;
    HashMap<Integer,HashSet<Integer>>follow;
    public Twitter() {
        users=new HashMap<>();
        follow=new HashMap<>();
    }
    int time=0;
    public void postTweet(int userId, int tweetId) {
        if(users.containsKey(userId)){
            users.get(userId).addFirst(new Pair<>(tweetId,time++));
        }
        else{
            LinkedList<Pair<Integer,Integer>>ll = new LinkedList<>();
            Pair<Integer,Integer>temp=new Pair<>(tweetId,time++);
            ll.add(temp);
            users.put(userId,ll);
        }
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer>sol = new ArrayList<>();
        HashSet<Integer>ll= follow.get(userId);
        PriorityQueue<Pair<Integer,Integer>>pq = new PriorityQueue<>((a,b)->{
            return b.getValue()-a.getValue();
        });
        if(ll!=null){
            ArrayList<Integer>f=new ArrayList<>(ll);
            for(int i=0;i<f.size();i++){
            LinkedList<Pair<Integer,Integer>>tweets = users.get(f.get(i));
            if(tweets!=null){
              for(int j=0;j<tweets.size();j++){
                pq.offer(tweets.get(j));
              }
            }
          }   
        }
        LinkedList<Pair<Integer,Integer>>temp = users.get(userId);
        if(temp!=null){
            for(int i=0;i<temp.size();i++){
              pq.offer(temp.get(i));
           }
        }
        int k=0;
        while(!pq.isEmpty()&&k++<10){
            sol.add(pq.poll().getKey());
        }
        return sol;
    }
    
    public void follow(int followerId, int followeeId) {
        if(follow.containsKey(followerId)){
            follow.get(followerId).add(followeeId);
        }
        else{
            HashSet<Integer>temp = new HashSet<>();
            temp.add(followeeId);
            follow.put(followerId,temp);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(follow.containsKey(followerId)){
          follow.get(followerId).remove((Integer)(followeeId));
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
//{ Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Pair<K,V>{ //custom pair class using generics
    K key;
    V value;
    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }
    
}
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        TreeMap<Integer,ArrayList<Integer>>hm = new TreeMap<>();
        Queue<Pair<Node,Integer>>queue = new ArrayDeque<>();
        queue.offer(new Pair<>(root,0));
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                 Pair<Node,Integer>pair = queue.poll();
                 int v=pair.getValue();
                 Node cur=pair.getKey();
                 if(hm.containsKey(v)){
                     hm.get(v).add(cur.data);
                 }
                 else{
                     ArrayList<Integer>tempp=new ArrayList<>();
                     tempp.add(cur.data);
                     hm.put(v,tempp);
                 }
                 if(cur.left!=null){
                     queue.offer(new Pair<>(cur.left,v-1));
                 }
                 if(cur.right!=null){
                     queue.offer(new Pair<>(cur.right,v+1));
                 }
            }
        }
        ArrayList<Integer>sol = new ArrayList<>();
        for(int key:hm.keySet()){
            ArrayList<Integer>temp = hm.get(key);
            for(int i=0;i<temp.size();i++){
                sol.add(temp.get(i));
            }
        }
        return sol;
    }
}
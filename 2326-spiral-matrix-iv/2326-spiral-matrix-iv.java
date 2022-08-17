/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode temp = head;
        int[][]ans = new int[m][n];
        int top =0,left=0;
        int right = n-1,down=m-1;
        int dir = 0;
        while(top<=down && left<=right)
        {
           
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    if(temp!=null){
                        ans[top][i]=temp.val;
                        temp=temp.next;
                    }
                    else{
                        ans[top][i]=-1; 
                    }
                    
                }
                top+=1;

            }
          else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                     if(temp!=null){
                        ans[i][right]=temp.val;
                        temp=temp.next;
                    }
                    else{
                        ans[i][right]=-1; 
                    }
                  
                }
                right-=1;

            }
          else if(dir==2)
          {
            for(int i=right;i>=left;i--)
            {
                 if(temp!=null){
                        ans[down][i]=temp.val;
                        temp=temp.next;
                    }
                    else{
                        ans[down][i]=-1; 
                    }
               
            }
            down-=1;

           }
         else if(dir==3)
        {
            for(int i=down;i>=top;i--)
            {
                 if(temp!=null){
                        ans[i][left]=temp.val;
                        temp=temp.next;
                    }
                    else{
                        ans[i][left]=-1; 
                    }
                
            }
            left+=1;

        }

            dir = (dir+1)%4;

        }
        return ans;
    }
}
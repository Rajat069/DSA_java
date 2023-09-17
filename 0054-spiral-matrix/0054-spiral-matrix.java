class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int top=0,left=0,right=arr[0].length-1,down=arr.length-1,dir=0;
        List<Integer> ans = new ArrayList<>();
        while(top<=down && left<=right)
        {
            if(dir==0)
            {    for(int i=left;i<=right;i++)ans.add(arr[top][i]);
                 top+=1;
            }
          else if(dir==1)
            {    for(int i=top;i<=down;i++)ans.add(arr[i][right]);
                 right-=1;
            }
          else if(dir==2)
            {    for(int i=right;i>=left;i--)ans.add(arr[down][i]);
                 down-=1;
            }
          else if(dir==3)
            {    for(int i=down;i>=top;i--)ans.add(arr[i][left]);
                 left+=1;
            }
            dir = (dir+1)%4;
        }
        return ans;
    }
}

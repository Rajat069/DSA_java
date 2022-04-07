class Solution {
    public int maximalRectangle(char[][] matrix) {
      int temp[] = new int[matrix[0].length];
      for(int i=0;i<matrix[0].length;i++){
          temp[i]=matrix[0][i]-'0';
      }
      int area =  maxarea(temp);
      for(int i=1;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++){
              if(matrix[i][j]=='1'){
                  temp[j]+=1;
              }
              else temp[j]=0;
            
          } 
          area=Math.max(maxarea(temp),area);
      }
        return area;
    }
      public int maxarea(int nums[]){
        int[] rs = presmaller(nums);
        int[] ls = nextsmaller(nums);
        int maxar= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(maxar<((rs[i]-ls[i]-1)*nums[i])) {  //-1 is done because a single bar is repeated twice when calculating length of rect
                maxar = (rs[i] - ls[i]-1) * nums[i];
            }
        }
        return maxar;
    }
    public int[] nextsmaller(int []a){   //left smaller element
        int [] ps= new int[a.length];
        Stack<Integer> st = new Stack <>();
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty()&&a[st.peek()]>=a[i]){
                st.pop();
            }
            if(st.size()==0){
                ps[i]=-1;
            }
            else ps[i]=st.peek();
            st.push(i);        //we store the indexes of the smaller element which will be used to calculate the area
        }
        return ps;
    }
    public  int[] presmaller(int []a){     //right minimum element
        int [] rs= new int[a.length];
        Stack<Integer> st = new Stack <>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty()&&a[st.peek()]>=a[i]){
                st.pop();
            }
            if(st.size()==0){
                rs[i]=a.length;         //this is done to simplify the problem
            }
            else rs[i]=st.peek();
            st.push(i);
        }
        return rs;
    }
}
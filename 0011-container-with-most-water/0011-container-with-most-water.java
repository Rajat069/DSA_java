class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int area=0;
        while(p1<p2){
            int h = Math.min(height[p1],height[p2]);
            int temp_area=h*(p2-p1);
            if(height[p1]>height[p2])p2--;
            else p1++;
            area=Math.max(temp_area,area);
        }
        return area;
    }
}
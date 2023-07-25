class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int f=0,l=arr.length-1;
      while(f<l){
          int mid=f+(l-f)/2;
          if(arr[mid]>arr[mid+1]){
              l=mid;
          }
          else f=mid+1;
      }
       return f; 
    }
}
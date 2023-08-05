class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[]nums,int low,int high){
        if(low<high){
            int mid = (high - low) / 2 + low;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++){
            L[i] = arr[l + i];   
        }
        for (int j = 0; j < n2; j++){
            R[j] = arr[m + 1 + j];   
        }
        int i = 0, j = 0,k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
         while (i < n1) {
            arr[k++] = L[i++];
        }
         while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
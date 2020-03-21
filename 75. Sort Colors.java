class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    
    }
    private static void quickSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        }
        int pivot = partition(arr, l ,r);
        quickSort(arr, l, pivot-1);
        quickSort(arr, pivot+1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int i = l, j = r+1;
        int value = arr[l];
        while(true){
            while(arr[++i] < value){
                if(i == r){
                    break;
                }
            }
            while(value < arr[--j]){
                if(j == l){
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, l, j);
        return j;
    }
    private static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
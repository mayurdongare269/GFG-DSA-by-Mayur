class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low >= high) {
            return;
        }
        
        int pIdx = partition(arr, low, high);
        quickSort(arr, low, pIdx-1);// left except middle
        quickSort(arr, pIdx+1, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        i++;
        int temp = pivot;
        arr[high] = arr[i];
        arr[i] = temp;
        
        return i;
        
    }
}
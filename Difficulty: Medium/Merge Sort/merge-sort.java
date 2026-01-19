class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l >= r) {
            return ;
        }
        
        int mid = l + (r-l) / 2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        merge(arr, l, mid, r);
    }
    
    void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1; 
        int k = 0;
        
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        //for remaining
        while(i <= mid) {
            temp[k++] = arr[i++]; 
        }
        
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        
        //copy temp to original arr
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
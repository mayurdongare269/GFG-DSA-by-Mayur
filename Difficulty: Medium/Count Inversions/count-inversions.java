class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int n = arr.length;
        return mergeSort(arr, 0, n-1);
    }
    
    public static int mergeSort(int arr[], int si, int ei) {
        int cnt = 0;
        if(si >= ei) {
            return 0;
        }

        int mid = si + (ei-si) / 2;

        cnt += mergeSort(arr, si, mid);
        cnt += mergeSort(arr, mid+1, ei);
        cnt += merge(arr, si, mid, ei);
        
        return cnt;
    }

    public static int merge(int arr[], int si, int mid, int ei) { // change
        int temp[] = new int[ei-si+1];

        // if(si >= ei) {
        //     return 0; // change
        // }
        
        int i = si;
        int j = mid+1;
        int k = 0;
        
        int cnt = 0; // change
        
        while (i <= mid && j <= ei) {
            if(arr[i] <= arr[j]) { // change =
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
                cnt += (mid - i + 1); // change
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length;k++, i++) {
            arr[i] = temp[k];
        }
        
        return cnt; // change
    }
}
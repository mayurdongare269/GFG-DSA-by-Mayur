// class Solution {
//     public int minTime(int[] arr, int k) {
//         // code here
        
//     }
    
    
// }


class Solution {
    
    private int countWorkers(int arr[], int maxWork) {
        int workers = 1, currentWork = 0;
        
        for (int task : arr) {
            if (currentWork + task <= maxWork) {
                currentWork += task;
            } else {
                workers++;
                currentWork = task;
            }
        }
        return workers;
    }
    
    public int minTime(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1; // more workers than tasks
        
        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for (int time : arr) {
            low = Math.max(low, time);
            high += time;
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int requiredWorkers = countWorkers(arr, mid);
            
            if (requiredWorkers > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

        
        
        
        
        
        
        
        
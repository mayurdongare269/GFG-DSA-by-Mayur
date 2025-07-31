// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = findFirst(arr, x);
        int last = findLast(arr, x);
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        
        return result;
    }
    
    private int findFirst(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x) {
                ans = mid;
                high = mid - 1; // keep searching in left half
            } else if(arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    
    private int findLast(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x) {
                ans = mid;
                low = mid + 1; // keep searching in right half
                 
            } else if(arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}

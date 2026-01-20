class Solution {
    int missingNum(int arr[]) {
        // code here
        // int n = arr.length+1;
        // long s = (long)(n*(n+1))/ 2;
        
        // long s2 = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     s2 += arr[i];
        // }
        
        // return (int) (s - s2);
        
        int n = arr.length + 1;

        // cast BEFORE multiplication
        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return (int) (expectedSum - actualSum);
    }
}
class Solution {
    int minRow(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int ind = 1;
        int cnt_min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            int cnt_one = 0;
            
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == 1) cnt_one++;
            }
            
            if(cnt_one < cnt_min) {
                cnt_min = cnt_one;
                ind = i + 1;
            }
        }
        
        return ind;
    }
};
class Solution {
  public:
    int getSecondLargest(vector<int> &a) {
        // code here
        
    int n = a.size();
    if (n < 2) return -1;  
     
    // int largest = INT_MIN;
    int fl = INT_MIN;
    int sl = INT_MIN;
    
    for(int i = 0; i < n; i++) {
      if(a[i] > fl) {
        sl = fl;
        fl = a[i];
      } else if(a[i] > sl && a[i] < fl) {
        sl = a[i];
      }
    }
    
    return (sl == INT_MIN) ? -1 : sl; 
    }
};

class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                small.add(i);
                if(i != n / i) {
                    large.add(n/i);
                }
            }
        }
        
        for(int num : small) System.out.print(num + " ");
        
        for(int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }
}

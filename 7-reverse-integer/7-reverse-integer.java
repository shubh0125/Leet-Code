class Solution {
    int num = 0;
    public int reverse(int x) {
        int n = Math.abs(x);
        while(n > 0){
            int rem = n % 10; 
            n /= 10; 
            if(num > Integer.MAX_VALUE/10 || num == Integer.MAX_VALUE/10 && rem > 7)
                return 0;
            num = num * 10 + rem;
        }
        return x < 0 ? -num : num;
    }
    
}
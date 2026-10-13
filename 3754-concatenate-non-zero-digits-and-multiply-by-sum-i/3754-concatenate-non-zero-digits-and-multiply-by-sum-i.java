class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long z = 0;
        while(n !=0){
            long rem = n%10;
            if(rem != 0){
                 x += rem;
                 z = (z*10) + rem;
            }
            n/=10;
        }
        long rev = reverse(z);
        return rev*x;

    }
    public static long reverse(long n){
        long ans = 0;
        while(n !=0 ){
            long rem = n%10;
            ans = (ans *10)+rem;
            n/=10;
        }
        return ans;
    }
}
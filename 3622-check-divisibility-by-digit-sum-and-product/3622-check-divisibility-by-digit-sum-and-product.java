class Solution {

    public boolean checkDivisibility(int n) {
        int original = n;
        int digitsum = 0;
        int digitProduct =1;

        while(n > 0){
            int digit =n%10;
            digitsum +=digit;
            digitProduct *=digit;
            n/=10;
        }
        int divisor =digitsum + digitProduct;
        return original % divisor ==0;
        
    }
}
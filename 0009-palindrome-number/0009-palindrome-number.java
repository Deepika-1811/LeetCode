class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        if(x<0){
            return false;
        }
        int rev=0;
        while(x>0){
            int r = x%10;
             rev = rev*10+r;
            x/=10;
        }
        if(rev==a){
            return true;
        }
        else{
            return false;
        }
    }
}
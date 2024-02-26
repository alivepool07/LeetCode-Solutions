class Solution {
    public boolean isPalindrome(int x) {
       int y = x;
       int revNum = 0;
       if (y <0){
           return false;
       }
       while (y !=0 ){

           int ld = y %10;
           revNum = (revNum * 10) + ld;
           y/=10;
       } 
       return revNum == x;
    }
}
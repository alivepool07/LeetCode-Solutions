class Solution {
    public boolean isPowerOfFour(int n) {
        int cnt = 0;
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            for(int i=0;n!=1;i++){
                cnt = cnt + n%4;
                n=n/4;
                 if(cnt != 0){
                return false;
            }
            }
           if(cnt == 0){
            return true;
           }
           else{
            return false;
           }
          
        }
    }
}
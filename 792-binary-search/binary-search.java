class Solution {
    public int search(int[] nums, int tar) {
        

        //recursive approach 

        int n = nums.length;
        return bs(nums , 0 , n-1 , tar);

    }
    public static int bs(int[] arr , int low , int high, int tar) {

        //base case
        if(low > high ) return -1;

        int mid = low + ((high-low)/2);
        if(arr[mid] == tar) return mid;
        else if (arr[mid] > tar) {
          return  bs(arr , low, mid-1 , tar);
        }
        else {
            return bs(arr , mid+1 , high ,tar);
        }
    }
}
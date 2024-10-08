class Solution {
    private int mid(int []nums,int n){
        int l=0,r=n-1;
        while(l<r){
            int mid = l+ (r-l)/2;
            if(nums[mid]>nums[r]){l=mid+1;}
            else r=mid; 
        }
        return r;
    }
    
    private int binarySearch(int l,int r,int []nums,int target){
        int ind=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ind;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int mid_index = mid(nums,n);
        int ind = binarySearch(0,mid_index-1,nums,target);
        if(ind!=-1)return ind;
        ind = binarySearch(mid_index,n-1,nums,target);
        return ind; 
    }
}
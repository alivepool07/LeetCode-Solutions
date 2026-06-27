1class Solution {
2    private int mid(int []nums,int n){
3        int l=0,r=n-1;
4        while(l<r){
5            int mid = l+ (r-l)/2;
6            if(nums[mid]>nums[r]){l=mid+1;}
7            else r=mid; 
8        }
9        return r;
10    }
11    
12    private int binarySearch(int l,int r,int []nums,int target){
13        int ind=-1;
14        while(l<=r){
15            int mid=l+(r-l)/2;
16            if(nums[mid]==target){
17                return mid;
18            }else if(nums[mid]<target){
19                l=mid+1;
20            }else{
21                r=mid-1;
22            }
23        }
24        return ind;
25    }
26
27    public int search(int[] nums, int target) {
28        int n = nums.length;
29        int mid_index = mid(nums,n);
30        int ind = binarySearch(0,mid_index-1,nums,target);
31        if(ind!=-1)return ind;
32        ind = binarySearch(mid_index,n-1,nums,target);
33        return ind; 
34    }
35}
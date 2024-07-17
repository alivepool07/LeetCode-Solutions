class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        int top = 0;
        int right = n-1;
        int left = 0;
        int bottom = m-1;

       while (top <=bottom && left <= right) {

         for(int i = left ; i  <= right ;i++) {
                list.add(arr[top][i]);
        }
        top++;

        
        for(int i = top ; i <= bottom;i++ ){

            list.add(arr[i][right]);
        }
        right--;

        // checking if top is less than bottm cause if if it's not less than bottom means there is no more rows
        if(top <= bottom) {
        for(int i = right; i>= left ; i--) {

            list.add(arr[bottom][i]);
        }
        bottom--;

        }
        // similarly checking for right and left cause right agr bada nhi hai left se to toh bottom to top jaayenge kaise 
        if(right >= left) {
        for(int i = bottom ; i>= top ; i--) {

            list.add(arr[i][left]);
        }
        left++;
        }
    }
    return list;

    }
}
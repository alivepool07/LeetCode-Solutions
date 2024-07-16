class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

// Optimal approach 

//Transpose the whole matrix 

        for (int i = 0 ; i < n ; i++) {

            for (int j = i ; j < m ; j++) {

                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

// reverse the transposed matrix in order to get the 90 degree roatation of actual matrix 

        for(int i = 0 ; i < n ; i++) {

            for(int j = 0 ; j < m/2 ; j++) {

                int temp = 0 ;

                temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp; 
            }
        }

    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int n;
    private TreeNode solve(String s , int[] ind , int d) {
        if(ind[0] >= n) return null;
        int j = ind[0];
        while (j < n && s.charAt(j) == '-') j++;
        int dash = j - ind[0];

        if(d != dash) return null;
        ind[0] = ind[0] + dash;

        int val= 0;
        while(ind[0] < n && Character.isDigit(s.charAt(ind[0]))) {
            val = val*10 + (s.charAt(ind[0]) - '0');
            ind[0]++;
        }
        TreeNode root = new TreeNode(val);
        root.left = solve(s, ind, d+1);
        root.right = solve(s , ind , d+1);
        return root;
    }
    public TreeNode recoverFromPreorder(String s) {

     n = s.length();
     int[] index = {0};
     return solve(s , index, 0);   
    }
}
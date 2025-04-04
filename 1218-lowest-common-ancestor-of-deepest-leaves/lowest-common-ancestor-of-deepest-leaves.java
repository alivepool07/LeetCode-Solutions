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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root).lca;
    }

    private Result helper(TreeNode node) {
        if (node == null) return new Result(0, null); 

        Result left = helper(node.left);
        Result right = helper(node.right);
        if (left.depth == right.depth) {
            return new Result(left.depth + 1, node);
        } 
        return (left.depth > right.depth) ? 
               new Result(left.depth + 1, left.lca) : 
               new Result(right.depth + 1, right.lca);
    }

    private static class Result {
        int depth;
        TreeNode lca;

        Result(int depth, TreeNode lca) {
            this.depth = depth;
            this.lca = lca;
        }
    }
}

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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

    // Recursively calculate the maximum depth of the left subtree
        int leftDepth = maxDepth(root.left);

    // Recursively calculate the maximum depth of the left subtree
        int rightDepth = maxDepth(root.right);

    return 1 + Math.max(leftDepth, rightDepth);

    }
}
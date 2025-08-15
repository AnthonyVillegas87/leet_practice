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
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
        
    }

    private int getHeight(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = getHeight(node.left);
        if(leftHeight == -1) return -1; // Unbalanced right subtree

         int rightHeight = getHeight(node.right);
        if (rightHeight == -1) {
            return -1; // Right subtree is unbalanced
        }
        if(Math.abs(leftHeight - rightHeight) > 1) return - 1; //current node is unbalanced

        return 1 + Math.max(leftHeight, rightHeight);


    }
}
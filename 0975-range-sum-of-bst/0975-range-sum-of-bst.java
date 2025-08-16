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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSum(root, low, high);
    }

    private int rangeSum(TreeNode node, int low, int high) {
        if(node == null) {
            return 0;
        }

        if(node.val < low) {
            return rangeSum(node.right, low, high);
        } else if(node.val > high) {
            return rangeSum(node.left, low, high);
        } else {
            return node.val + rangeSum(node.left, low, high) + rangeSum(node.right, low, high);
        }
    }
}
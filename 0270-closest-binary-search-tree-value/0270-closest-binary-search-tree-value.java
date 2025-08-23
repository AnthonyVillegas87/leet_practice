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
    public int closestValue(TreeNode root, double target) {
        int closestVal = root.val;

        while(root != null) {
            if(Math.abs(target - root.val) < Math.abs(target - closestVal)) {
                closestVal = root.val;

            } else if (Math.abs(target - root.val) == Math.abs(target - closestVal)) {
                closestVal = Math.min(closestVal, root.val);
            }

            if(target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        
        }
        return closestVal;
    }
}
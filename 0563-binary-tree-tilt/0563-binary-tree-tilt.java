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
    int ans;
    public int func(TreeNode root){
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return root.val;
        int left=func(root.left);
        int right=func(root.right);
        
        ans+=Math.abs(left-right);
        return root.val+left+right;
    }
    public int findTilt(TreeNode root) {
        ans=0;
        func(root);
        return ans;
    }
}
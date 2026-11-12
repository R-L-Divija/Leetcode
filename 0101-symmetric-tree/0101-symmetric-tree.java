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
    public boolean func(TreeNode l,TreeNode r){
        if(l==null&&r==null)return true;
        if(l==null||r==null)return false;
        
        if(l.val!=r.val)return false;
        return func(l.left,r.right)&&func(l.right,r.left);

    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return func(root.left,root.right);
    }
}
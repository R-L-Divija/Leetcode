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
    
    public int func(TreeNode root){
        if(root==null)return 0;
        int l=func(root.left);
        if(l==-1)return -1;
        int r=func(root.right);
        if(r==-1)return -1;
        if(Math.abs(l-r)>1)return -1;
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        return func(root)!=-1;
       
        
    }
}
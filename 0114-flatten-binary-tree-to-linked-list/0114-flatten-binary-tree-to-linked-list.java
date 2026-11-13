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
    TreeNode temp;
    public void func(TreeNode root){
        if(root==null)return ;
        TreeNode left=root.left;
       TreeNode right=root.right;

       
       if(temp!=null){
       temp.right=root;
       }
        root.left=null;
        temp=root;

        func(left);
        func(right);
    }
    public void flatten(TreeNode root) {
        func(root);
        
    }
}
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
    int s=Integer.MIN_VALUE;
   
    public int func(TreeNode root){
   if(root==null)return 0;

   int l=Math.max(0,func(root.left));
   int r=Math.max(0,func(root.right));
  int s1=root.val+l+r;
   s=Math.max(s,s1);
   return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        func(root);
    
        return s;
    }
}
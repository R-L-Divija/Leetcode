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
  ArrayList<Integer>ans=new ArrayList<>();
    public void func(TreeNode root){
    if(root==null)return;
    func(root.left);
    ans.add(root.val);
    func(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
       func(root);
       int l=0;
       int r=ans.size()-1;
       int sum=0;
       while(l<r){
        sum=ans.get(l)+ans.get(r);
        if(sum==k)return true;
        if(sum<k)l++;
       else r--;
       }
        return false;
    }
}
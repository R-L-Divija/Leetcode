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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp;
        if(root==null)return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            temp=new ArrayList<>();
            while(s-->0){
               TreeNode t=q.poll();
               temp.add(t.val);
               if(t.left!=null)q.offer(t.left);
               if(t.right!=null)q.offer(t.right); 
            }
            ans.add(temp);
        }
       return ans;
    }
}
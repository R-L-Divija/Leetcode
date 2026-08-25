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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            int c=0;
            while(s-->0){
                TreeNode t=q.poll();
                if(c==0){
                    ans.add(t.val);
                }
                if(t.right!=null)q.add(t.right);
                if(t.left!=null)q.add(t.left);
                c++;
            }
        }
        return ans;

    }
}
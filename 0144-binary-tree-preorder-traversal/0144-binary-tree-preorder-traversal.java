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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();

        Stack<TreeNode>st=new Stack<>();
        if(root==null)return ans;

        st.push(root);
        while(!st.isEmpty()){
            TreeNode t=st.pop();
            ans.add(t.val);
            if(t.right!=null)st.push(t.right);
            if(t.left!=null)st.push(t.left);

        }
        return ans;
    }
}
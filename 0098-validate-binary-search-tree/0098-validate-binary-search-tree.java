class Solution {
    private List<Integer> p;

    private void func(TreeNode root) {
        if (root == null) return;

        func(root.left);
        p.add(root.val);
        func(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        p = new ArrayList<>();
        func(root);
        
        for (int i = 1; i < p.size(); i++) {
            int prev = p.get(i - 1);
            int cur = p.get(i);
            if (prev >= cur) return false; // Strictly increasing required
        }
        return true;
    }
}
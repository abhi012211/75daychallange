class Solution {
    public boolean isUnivalTree(TreeNode root) {
        boolean left=root.left==null || root.left.val==root.val && isUnivalTree(root.left);
        boolean right=root.right==null || root.right.val==root.val && isUnivalTree(root.right);
        return left && right;
    }
}

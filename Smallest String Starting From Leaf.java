class Solution {
    String st=null;
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return  st;
    }
    private void dfs(TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        sb.insert(0,(char)('a'+root.val));
        if(root.left==null && root.right==null){
            if(st==null || st.compareTo(sb.toString())>0){
                st=sb.toString();
            }
        }
            dfs(root.left,sb);
            dfs(root.right,sb);
            sb.deleteCharAt(0);
    }
}

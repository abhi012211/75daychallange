class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        result(root,al,0);
        return al;
    }
    public void result(TreeNode root,List<Integer> al,int level){
        if(root==null) return;

        if(level==al.size()){
            al.add(root.val);
        }else{
            al.set(level,Math.max(al.get(level),root.val));
        }
        result(root.left,al,level+1);
        result(root.right,al,level+1);
    }
}

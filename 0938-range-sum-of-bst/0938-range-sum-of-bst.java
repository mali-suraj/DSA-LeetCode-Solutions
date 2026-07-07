class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root,low,high);
    }
    public int sum(TreeNode root, int low, int high){
        if(root ==null)return 0;
        int l =sum(root.left,low,high);
        int r =sum(root.right,low,high);
        return l+r+((root.val>=low && root.val<=high)?root.val:0);
    }

}
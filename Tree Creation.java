public class TreeNode {
    
    int val;
    TreeNode left;
    TreeNode right;

    
    TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }

     public static void main(String[] args){

TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);

root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);

System.out.println("Tree Created" );
}
}



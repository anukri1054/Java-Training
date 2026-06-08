public class TreeInorder {

    int val;
    TreeInorder left;
    TreeInorder right;

    TreeInorder(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void inorder(TreeInorder node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        TreeInorder root = new TreeInorder(10);
        root.left = new TreeInorder(15);
        root.right = new TreeInorder(2);

        root.left.left = new TreeInorder(3);
        root.left.right = new TreeInorder(9);

        root.right.left = new TreeInorder(7);
        root.right.right = new TreeInorder(4);

        root.inorder(root);
    }
}
    

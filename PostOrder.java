public class TreePostorder {

    int val;
    TreePostorder left;
    TreePostorder right;

    TreePostorder(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void postorder(TreePostorder node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {

        TreePostorder root = new TreePostorder(10);
        root.left = new TreePostorder(15);
        root.right = new TreePostorder(2);

        root.left.left = new TreePostorder(3);
        root.left.right = new TreePostorder(9);

        root.right.left = new TreePostorder(7);
        root.right.right = new TreePostorder(4);

        root.postorder(root);
    }
}
    




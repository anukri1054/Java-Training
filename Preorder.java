public class TreePreorder {

    int val;
    TreePreorder left;
    TreePreorder right;

    TreePreorder(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void preorder(TreePreorder node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {

        TreePreorder root = new TreePreorder(10);
        root.left = new TreePreorder(15);
        root.right = new TreePreorder(2);

        root.left.left = new TreePreorder(3);
        root.left.right = new TreePreorder(9);

        root.right.left = new TreePreorder(7);
        root.right.right = new TreePreorder(4);

        root.preorder(root);
    }
}

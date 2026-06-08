public class TreeHeight {

    int val;
    TreeHeight left;
    TreeHeight right;

    TreeHeight(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public int height(TreeHeight node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        TreeHeight root = new TreeHeight(10);

        root.left = new TreeHeight(15);
        root.right = new TreeHeight(2);

        root.left.left = new TreeHeight(3);
        root.left.right = new TreeHeight(9);

        root.right.left = new TreeHeight(7);
        root.right.right = new TreeHeight(4);

        int h = root.height(root);

        System.out.println("Height = " + h);
    }
}

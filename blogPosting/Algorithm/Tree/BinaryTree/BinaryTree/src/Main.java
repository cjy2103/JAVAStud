public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] data = {10, 5, 6, 8, 3, 1, 2, 11, 7, 9, 12};

        for(int value : data){
            tree.insert(value);
        }

        tree.inOrderTraversal(tree.node);
        System.out.println();
        tree.preOrder(tree.node);
        System.out.println();
        tree.postOrderTraversal(tree.node);
    }
}
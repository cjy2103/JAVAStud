public class BinaryTree {
    Node root;

    public void insert(int data){
        root = insertNode(root, data);
    }

    private Node insertNode(Node current, int data){
        if(current == null){
            return new Node(data);
        }

        if(data < current.data){
            current.left = insertNode(current.left, data);
        } else if(data > current.data){
            current.right = insertNode(current.right, data);
        }

        return current;
    }

    /**
     * @DESC: 중위 순회
     */
    public void inOrderTraversal(Node root){

    }
}

public class BinaryTree {
    Node node;

    public void insert(int data){
        node = insertNode(node, data);
    }

    private Node insertNode(Node current, int data){
        if(current == null){
            return new Node(data);
        }

        if(data <= current.data){
            current.left = insertNode(current.left, data);
        } else {
            current.right = insertNode(current.right, data);
        }

        return current;
    }

    public void delete(int data){
        node = deleteNode(node, data);
    }

    private Node deleteNode(Node node, int data) {
        if(node == null){
            return null;
        }

        if(data == node.data){
            if(node.left == null){
                return node.right;
            } else if (node.right == null){
                return node.left;
            } else {
                Node successor = findSuccessor(node.right);
                node.data = successor.data;
                node.right = deleteNode(node.right, successor.data);
                return node;
            }
        } else if(data < node.data){
            node.left = deleteNode(node.left, data);
        } else {
            node.right = deleteNode(node.right, data);
        }

        return node;
    }

    private Node findSuccessor(Node node) {
        while (node.left != null){
            node = node.left;
        }
        return node;
    }


    /**
     * @DESC: 전위 순회
     */
    public void preOrder(Node node){
        if(node != null){
            System.out.print(node.data+ " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * @DESC: 중위 순회
     */
    public void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.data+ " ");
            inOrderTraversal(node.right);
        }
    }

    /**
     * @DESC: 후위 순회
     */
    public void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data+ " ");
        }
    }

}

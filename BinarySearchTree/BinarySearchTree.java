package BinarySearchTree;

public class BinarySearchTree {
    Node root;
    // no-arg constructor, empty BST

    BinarySearchTree(){
        root = null;
    }

    public void TreeInsert(BinarySearchTree Tree, Node z){
        Node y = null;
        Node x = root;
        while(x != null){
            y = x;
            if(z.key < x.key){
                x = x.leftChild;
            } else{
                x = x.rightChild;
            }
        }
        z.setParent(y);
        if(y == null){
            this.root = z;
        } else if(z.key < y.key){
            y.setLeftChild(z);
        } else{
            y.setRightChild(z);
        }
    }

    // prints the nodes in sorted order
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.key + " ");
        inOrder(node.rightChild);
    }

}

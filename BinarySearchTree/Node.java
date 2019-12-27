package BinarySearchTree;

public class Node {
    int key;
    Node leftChild, rightChild, parent;

    public Node(int key){
        this.key = key;
        leftChild = null;
        rightChild = null;
        parent = null;
    }

    public void setParent(Node parent){
        this.parent = parent;
    }

    public void setLeftChild(Node leftChild){
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild){
        this.rightChild = rightChild;
    }
}

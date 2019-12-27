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

    /*
    Method to return the node of a given key value
     */
    public Node treeSearch(Node x, int key){
        while(x != null && key != x.key){
            if(k < x.key){
                x = x.leftChild;
            } else{
                x = x.rightChild;
            }
        }
        return x;
    }

    /*
    To find Tree-Max and Tree-Min given a Node
    This works with sub-trees too since it will
    look for the largest/smallest node in the sub-tree
     */
    public Node treeMin(Node node){
        while(node.leftChild != null){
            node = node.leftChild;
        }
        return node;
    }
    public Node treeMax(Node node){
        while(node.rightChild != null){
            node = node.rightChild;
        }
        return node;
    }

    /*
    Successor and predecessor
    Successor: The node with the smallest key value (of all nodes) that is larger than given node
    Predecessor: The node with largest key value (of all nodes) that is smaller than given node
     */
    public Node successor(Node node){
        if(node.rightChild != null){
            return treeMin(node.rightChild);
        }
        Node y = node.parent;
        while(y != null && node == y.rightChild){
            node = y;
            y = y.parent;
        }
        return y;
    }

    public Node predecessor(Node node){
        if(node.leftChild != null){
            return treeMax(node.leftChild);
        }
        Node y = node.parent;
        while(y != null && node == y.leftChild){
            node = y;
            y = y.parent;
        }
        return y;
    }



}

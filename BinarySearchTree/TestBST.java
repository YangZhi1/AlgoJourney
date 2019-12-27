package BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree Tree1 = new BinarySearchTree();
        Tree1.TreeInsert(Tree1, new Node(120));
        Tree1.TreeInsert(Tree1, new Node(20));
        Tree1.TreeInsert(Tree1, new Node(29));
        Tree1.TreeInsert(Tree1, new Node(49));
        Tree1.TreeInsert(Tree1, new Node(0));
        Tree1.TreeInsert(Tree1, new Node(132));
        Tree1.TreeInsert(Tree1, new Node(2));

        Tree1.inOrder(Tree1.root);
    }
}

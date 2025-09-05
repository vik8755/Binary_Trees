package binarytrees;

public class InorderTraversal {
    public static void traverse(Node<Integer> root){
        if (root==null) return;
        traverse(root.left);
        System.out.print(root.data+", ");
        traverse(root.right);
    }

    public static void main(String[] args) {
        traverse(BinaryTree.createTree());
    }
}

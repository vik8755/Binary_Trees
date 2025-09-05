package binarytrees;

public class PreOrderTraversal {
    public static void traverse(Node<Integer> root){
        if (root==null) return;
        System.out.print(root.data+", ");
        traverse(root.left);
        traverse(root.right);
    }
    public static void main(String[] args) {
        traverse(BinaryTree.createTree());
    }
}

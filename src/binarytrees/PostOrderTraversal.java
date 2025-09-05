package binarytrees;

public class PostOrderTraversal {
    public static void traverse(Node<Integer> root){
        if (root==null) return;
        traverse(root.left);
        traverse(root.right);
        System.out.print(root.data+", ");
    }
    public static void main(String[] args) {
        traverse(BinaryTree.createTree());
    }
}

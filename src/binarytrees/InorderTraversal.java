package binarytrees;

import java.util.Stack;

public class InorderTraversal {
    public static void traverse(Node<Integer> root){
        if (root==null) return;
        traverse(root.left);
        System.out.print(root.data+", ");
        traverse(root.right);
    }
    public static void iterativeTraverse(Node<Integer> root){
        if (root==null) return;
        Stack<Node<Integer>> stack=new Stack<>();
        Node<Integer> currentNode=root;
        while (currentNode!=null ||!stack.isEmpty()){
            while (currentNode!=null){
                stack.push(currentNode);
                currentNode=currentNode.left;
            }
               currentNode=stack.pop();
                System.out.print(currentNode.data+", ");
               currentNode=currentNode.right;
            }
    }

    public static void main(String[] args) {
      //  traverse(BinaryTree.createTree());
        iterativeTraverse(BinaryTree.createTree());
    }
}

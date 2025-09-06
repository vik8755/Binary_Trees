package binarytrees;

import java.util.Stack;

public class PreOrderTraversal {
    public static void traverse(Node<Integer> root){
        if (root==null) return;
        System.out.print(root.data+", ");
        traverse(root.left);
        traverse(root.right);
    }
    public static void iterativeTraverse(Node<Integer> root){
        if (root==null) return;
        Stack<Node<Integer>> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node<Integer> temp=stack.pop();
            System.out.print(temp.data+", ");
            if(temp.right!=null)stack.push(temp.right);
            if(temp.left!=null)stack.push(temp.left);
        }
    }

    public static void main(String[] args) {
        traverse(BinaryTree.createTree());
        System.out.println();
        iterativeTraverse(BinaryTree.createTree());
    }
}
